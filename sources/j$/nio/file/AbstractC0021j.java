package j$.nio.file;

import java.net.URI;
import java.security.AccessController;

/* renamed from: j$.nio.file.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
abstract class AbstractC0021j {
    static final FileSystem a = ((j$.nio.file.spi.d) AccessController.doPrivileged(new C0020i())).j(URI.create("file:///"));
}
