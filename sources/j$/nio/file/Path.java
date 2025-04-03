package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* loaded from: classes9.dex */
public interface Path extends Comparable<Path>, Iterable<Path> {
    boolean E(Path path);

    Path I(Path path);

    I J(J j, G... gArr);

    Path X(Path path);

    boolean endsWith(String str);

    boolean equals(Object obj);

    Path getFileName();

    FileSystem getFileSystem();

    Path getName(int i);

    int getNameCount();

    Path getParent();

    Path getRoot();

    boolean isAbsolute();

    Iterator iterator();

    Path normalize();

    I p(J j, G[] gArr, H... hArr);

    Path resolve(String str);

    Path resolveSibling(String str);

    Path s(Path path);

    boolean startsWith(String str);

    Path subpath(int i, int i2);

    Path t(k... kVarArr);

    Path toAbsolutePath();

    File toFile();

    String toString();

    URI toUri();

    int w(Path path);

    boolean z(Path path);
}
