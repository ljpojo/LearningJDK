/*
 * Copyright (c) 2007, 2009, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package java.nio.file;

/**
 * The result type of a {@link FileVisitor FileVisitor}.
 *
 * @since 1.7
 *
 * @see Files#walkFileTree
 */
// 文件树遍历结果，包含了各种信号，指导后续的遍历行为
public enum FileVisitResult {
    
    /**
     * Continue. When returned from a {@link FileVisitor#preVisitDirectory preVisitDirectory} method
     * then the entries in the directory should also be visited.
     */
    CONTINUE,       // 继续遍历
    
    /**
     * Terminate.
     */
    TERMINATE,      // 结束遍历
    
    /**
     * Continue without visiting the entries in this directory.
     * This result is only meaningful when returned from the {@link FileVisitor#preVisitDirectory preVisitDirectory} method;
     * otherwise this result type is the same as returning {@link #CONTINUE}.
     */
    SKIP_SUBTREE,   // 跳过其他子项
    
    /**
     * Continue without visiting the <em>siblings</em> of this file or directory.
     * If returned from the {@link FileVisitor#preVisitDirectory preVisitDirectory} method
     * then the entries in the directory are also skipped and the {@link FileVisitor#postVisitDirectory postVisitDirectory} method is not invoked.
     */
    SKIP_SIBLINGS;  // 跳过其他兄弟项
    
}
