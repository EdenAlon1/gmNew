package j$.nio.file;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.nio.file.attribute.InterfaceC0008e;
import j$.nio.file.attribute.InterfaceC0011h;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes9.dex */
public final class Files {
    static {
        j$.desugar.sun.nio.fs.g.c(new Object[]{C.CREATE_NEW, C.WRITE});
    }

    public static void a(Path path) {
        path.getFileSystem().B().f(path);
    }

    public static boolean b(Path path, k... kVarArr) {
        if (kVarArr.length == 0) {
            d(path);
        }
        try {
            int length = kVarArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                k kVar = kVarArr[i];
                if (kVar != k.NOFOLLOW_LINKS) {
                    kVar.getClass();
                    throw new AssertionError("Should not get here");
                }
                i++;
                z = false;
            }
            if (z) {
                d(path).a(path, new EnumC0003a[0]);
                return true;
            }
            e(path, k.NOFOLLOW_LINKS);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static SeekableByteChannel c(Path path, n... nVarArr) {
        Set set;
        if (nVarArr.length == 0) {
            set = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, nVarArr);
            set = hashSet;
        }
        return d(path).q(path, set, new j$.nio.file.attribute.m[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long copy(InputStream inputStream, Path path, CopyOption... copyOptionArr) {
        inputStream.getClass();
        int length = copyOptionArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            CopyOption copyOption = copyOptionArr[i];
            if (copyOption != StandardCopyOption.REPLACE_EXISTING) {
                if (copyOption == null) {
                    throw new NullPointerException("options contains 'null'");
                }
                throw new UnsupportedOperationException(String.valueOf(copyOption).concat(" not supported"));
            }
            i++;
            z = true;
        }
        if (z) {
            try {
                d(path).g(path);
            } catch (SecurityException e) {
                e = e;
            }
        }
        e = null;
        try {
            OutputStream w = d(path).w(path, C.CREATE_NEW, C.WRITE);
            try {
                long transferTo = inputStream instanceof InputStreamRetargetInterface ? ((InputStreamRetargetInterface) inputStream).transferTo(w) : DesugarInputStream.transferTo(inputStream, w);
                if (w != null) {
                    w.close();
                }
                return transferTo;
            } catch (Throwable th) {
                if (w != null) {
                    try {
                        w.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileAlreadyExistsException e2) {
            if (e != null) {
                throw e;
            }
            throw e2;
        }
    }

    private static j$.nio.file.spi.d d(Path path) {
        return path.getFileSystem().B();
    }

    public static InterfaceC0011h e(Path path, k... kVarArr) {
        return d(path).x(path, InterfaceC0011h.class, kVarArr);
    }

    public static boolean isSymbolicLink(Path path) {
        try {
            return e(path, k.NOFOLLOW_LINKS).isSymbolicLink();
        } catch (IOException unused) {
            return false;
        }
    }

    public static Path move(Path path, Path path2, CopyOption... copyOptionArr) {
        j$.nio.file.spi.d d = d(path);
        if (d(path2).equals(d)) {
            d.o(path, path2, copyOptionArr);
            return path2;
        }
        int length = copyOptionArr.length;
        int i = length + 2;
        CopyOption[] copyOptionArr2 = new CopyOption[i];
        for (int i2 = 0; i2 < length; i2++) {
            CopyOption copyOption = copyOptionArr[i2];
            if (copyOption == StandardCopyOption.ATOMIC_MOVE) {
                throw new AtomicMoveNotSupportedException(null, null, "Atomic move between providers is not supported");
            }
            copyOptionArr2[i2] = copyOption;
        }
        copyOptionArr2[length] = k.NOFOLLOW_LINKS;
        copyOptionArr2[length + 1] = StandardCopyOption.COPY_ATTRIBUTES;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < i; i3++) {
            CopyOption copyOption2 = copyOptionArr2[i3];
            if (copyOption2 == StandardCopyOption.REPLACE_EXISTING) {
                z2 = true;
            } else if (copyOption2 == k.NOFOLLOW_LINKS) {
                z = false;
            } else {
                if (copyOption2 != StandardCopyOption.COPY_ATTRIBUTES) {
                    copyOption2.getClass();
                    throw new UnsupportedOperationException("'" + String.valueOf(copyOption2) + "' is not a recognized copy option");
                }
                z3 = true;
            }
        }
        InterfaceC0011h x = d(path).x(path, InterfaceC0011h.class, z ? new k[0] : new k[]{k.NOFOLLOW_LINKS});
        if (x.isSymbolicLink()) {
            throw new IOException("Copying of symbolic links not supported");
        }
        if (z2) {
            d(path2).g(path2);
        } else if (b(path2, new k[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (x.isDirectory()) {
            path2.getFileSystem().B().c(path2, new j$.nio.file.attribute.m[0]);
        } else {
            InputStream v = path.getFileSystem().B().v(path, new n[0]);
            try {
                copy(v, path2, new CopyOption[0]);
                if (v != null) {
                    v.close();
                }
            } catch (Throwable th) {
                if (v != null) {
                    try {
                        v.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (z3) {
            try {
                ((InterfaceC0008e) path2.getFileSystem().B().h(path2, InterfaceC0008e.class, new k[0])).a(x.lastModifiedTime(), x.lastAccessTime(), x.creationTime());
            } catch (Throwable th3) {
                try {
                    a(path2);
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        a(path);
        return path2;
    }

    public static Path readSymbolicLink(Path path) {
        return d(path).z(path);
    }
}
