package defpackage;

import android.net.Uri;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Comparator;
import j$.util.Optional;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgnd implements emmt {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/mdd/MddFileProvider");
    public final cgmd b;
    public final efbm c;
    public final Executor d;
    private final cgmf e;
    private final Executor f;

    public cgnd(cgmf cgmfVar, efbm efbmVar, Executor executor, Executor executor2, cgmd cgmdVar) {
        this.c = efbmVar;
        this.e = cgmfVar;
        this.d = executor;
        this.f = executor2;
        this.b = cgmdVar;
    }

    private final Uri j(emhx emhxVar) {
        cgmd cgmdVar = this.b;
        String str = emhxVar.c;
        String str2 = emhxVar.d;
        if (!cgmdVar.b(str, str2)) {
            h(this.e.g(str2), str2);
        }
        return this.b.a(emhxVar.c, emhxVar.d);
    }

    private final elfl k(final emhx emhxVar) {
        elfl e;
        cgmd cgmdVar = this.b;
        String str = emhxVar.c;
        final String str2 = emhxVar.d;
        if (cgmdVar.b(str, str2)) {
            e = elfo.e(null);
        } else {
            e = this.e.h(str2).h(new emwl() { // from class: cgmz
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cgnd.this.h((Optional) obj, str2);
                    return null;
                }
            }, this.d);
        }
        return e.h(new emwl() { // from class: cgmx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cgmd cgmdVar2 = cgnd.this.b;
                emhx emhxVar2 = emhxVar;
                return cgmdVar2.a(emhxVar2.c, emhxVar2.d);
            }
        }, this.d);
    }

    @Override // defpackage.emmt
    public final emhv a(String str) {
        return emms.a(str);
    }

    @Override // defpackage.emmt
    public final erph b(final emhv emhvVar) {
        if ((emhvVar.b & 2) != 0) {
            return erph.c(new erov() { // from class: cgnc
                @Override // defpackage.erov
                public final Object a(erpc erpcVar) {
                    FileInputStream fileInputStream = new FileInputStream(emhvVar.d);
                    erpcVar.a(fileInputStream, cgnd.this.d);
                    return fileInputStream;
                }
            }, this.d);
        }
        emhx emhxVar = emhvVar.c;
        if (emhxVar == null) {
            emhxVar = emhx.a;
        }
        return new erph(k(emhxVar)).e(new erow() { // from class: cgmv
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                cgnd cgndVar = cgnd.this;
                emhv emhvVar2 = emhvVar;
                Uri uri = (Uri) obj;
                if (uri == null) {
                    throw new IOException("Could not get URI for file:, ".concat(emms.b(emhvVar2)));
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream((File) cgndVar.c.c(uri, new efdw()));
                    erpcVar.a(fileInputStream, cgndVar.d);
                    return fileInputStream;
                } catch (Exception e) {
                    ensk j = cgnd.a.j();
                    j.Y(ente.a, "BugleMDD");
                    enrr enrrVar = (enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/mdd/MddFileProvider", "getFileInputStream", 115, "MddFileProvider.java");
                    emhx emhxVar2 = emhvVar2.c;
                    if (emhxVar2 == null) {
                        emhxVar2 = emhx.a;
                    }
                    String str = emhxVar2.c;
                    emhx emhxVar3 = emhvVar2.c;
                    if (emhxVar3 == null) {
                        emhxVar3 = emhx.a;
                    }
                    enrrVar.D("Exception while reading the MDD file. mddFileId = %s, mddGroup = %s", str, emhxVar3.d);
                    throw new IOException("Could not read file.", e);
                }
            }
        }, this.f);
    }

    @Override // defpackage.emmt
    public final erph c(final emhv emhvVar) {
        if ((emhvVar.b & 2) != 0) {
            return erph.c(new erov() { // from class: cgmu
                @Override // defpackage.erov
                public final Object a(erpc erpcVar) {
                    FileInputStream fileInputStream = new FileInputStream(emhvVar.d);
                    erpcVar.a(fileInputStream, cgnd.this.d);
                    return fileInputStream;
                }
            }, this.f);
        }
        emhx emhxVar = emhvVar.c;
        if (emhxVar == null) {
            emhxVar = emhx.a;
        }
        return new erph(k(emhxVar)).e(new erow() { // from class: cgmw
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                cgnd cgndVar = cgnd.this;
                InputStream g = cgndVar.g((Uri) obj, emhvVar);
                erpcVar.a(g, cgndVar.d);
                return g;
            }
        }, this.f);
    }

    @Override // defpackage.emmt
    public final ListenableFuture d(emhv emhvVar) {
        if ((emhvVar.b & 2) != 0) {
            return elfo.e(Optional.of(emhvVar.d));
        }
        emhx emhxVar = emhvVar.c;
        if (emhxVar == null) {
            emhxVar = emhx.a;
        }
        return k(emhxVar).h(new emwl() { // from class: cgnb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Uri uri = (Uri) obj;
                return uri == null ? Optional.empty() : Optional.of(uri.toString());
            }
        }, this.d);
    }

    @Override // defpackage.emmt
    public final ListenableFuture e() {
        return this.e.a().h(new emwl() { // from class: cgna
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList((engw) obj);
                Collections.sort(arrayList, Comparator.EL.reversed(Comparator.CC.comparingInt(new ToIntFunction() { // from class: cgmy
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj2) {
                        return ((dwns) obj2).f;
                    }
                })));
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    dwns dwnsVar = (dwns) arrayList.get(i);
                    dwnr b = dwnr.b(dwnsVar.g);
                    if (b == null) {
                        b = dwnr.UNSPECIFIED;
                    }
                    if (b == dwnr.DOWNLOADED && hashSet.add(dwnsVar.c)) {
                        cgnd.this.h(Optional.of(dwnsVar), dwnsVar.c);
                    }
                }
                return null;
            }
        }, this.d);
    }

    @Override // defpackage.emmt
    public final synchronized InputStream f(emhv emhvVar) {
        if ((emhvVar.b & 2) != 0) {
            return new FileInputStream(emhvVar.d);
        }
        emhx emhxVar = emhvVar.c;
        if (emhxVar == null) {
            emhxVar = emhx.a;
        }
        return g(j(emhxVar), emhvVar);
    }

    public final InputStream g(Uri uri, emhv emhvVar) {
        if (uri == null) {
            throw new IOException("Could not get URI for file:, ".concat(emms.b(emhvVar)));
        }
        try {
            return (InputStream) this.c.c(uri, new efdy());
        } catch (Exception e) {
            ensk j = a.j();
            j.Y(ente.a, "BugleMDD");
            enrr enrrVar = (enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/mdd/MddFileProvider", "getInputStreamFromUri", 149, "MddFileProvider.java");
            emhx emhxVar = emhvVar.c;
            if (emhxVar == null) {
                emhxVar = emhx.a;
            }
            String str = emhxVar.c;
            emhx emhxVar2 = emhvVar.c;
            if (emhxVar2 == null) {
                emhxVar2 = emhx.a;
            }
            enrrVar.D("Exception while reading the MDD file. mddFileId = %s, mddGroup = %s", str, emhxVar2.d);
            throw new IOException("Could not read file.", e);
        }
    }

    public final void h(Optional optional, String str) {
        if (optional.isEmpty()) {
            return;
        }
        try {
            for (dwno dwnoVar : ((dwns) optional.get()).h) {
                this.b.a.put(Pair.create(dwnoVar.c, str), Uri.parse(dwnoVar.d));
            }
        } catch (Exception e) {
            ensk j = a.j();
            j.Y(ente.a, "BugleMDD");
            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/mdd/MddFileProvider", "cacheFileGroup", (char) 345, "MddFileProvider.java")).q("Exception while reading mdd file from mobstore");
        }
    }

    @Override // defpackage.emmt
    public final synchronized cgmb i(emhv emhvVar) {
        int i = emhvVar.b;
        if ((i & 2) != 0 && (i & 1) == 0) {
            return new cgmb(emhvVar.d);
        }
        emhx emhxVar = emhvVar.c;
        if (emhxVar == null) {
            emhxVar = emhx.a;
        }
        Uri j = j(emhxVar);
        if (j == null) {
            throw new IOException("Could not find URI for file.");
        }
        try {
            return new cgmb((efds) this.c.c(j, new efdt()));
        } catch (Exception e) {
            ensk j2 = a.j();
            j2.Y(ente.a, "BugleMDD");
            ((enrr) ((enrr) ((enrr) j2).g(e)).h("com/google/android/apps/messaging/shared/mdd/MddFileProvider", "getCloseableNativeFileFromUri", 204, "MddFileProvider.java")).D("Exception while reading the MDD file. mddFileId = %s, mddGroup = %s", emhxVar.c, emhxVar.d);
            throw new IOException("Error while tyring to create closeable native.");
        }
    }
}
