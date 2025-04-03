package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejep {
    private final ekql a;
    private final ejfi b;

    public ejep(ekql ekqlVar, ejfi ejfiVar) {
        this.a = ekqlVar;
        this.b = ejfiVar;
    }

    final engw a(final enip enipVar, final enip enipVar2, final boolean z) {
        boolean z2 = true;
        if ((enipVar != null || enipVar2 == null) && (enipVar == null || enipVar2 != null)) {
            z2 = false;
        }
        emxf.a(z2);
        int i = engw.d;
        engr engrVar = new engr();
        enqu listIterator = this.a.a().listIterator();
        while (listIterator.hasNext()) {
            File[] listFiles = new File((File) listIterator.next(), "accounts").listFiles(new FilenameFilter() { // from class: ejeo
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    File file2 = new File(file, str);
                    try {
                        Integer valueOf = Integer.valueOf(str);
                        if (valueOf.intValue() < 0) {
                            return false;
                        }
                        enip enipVar3 = enip.this;
                        if (enipVar3 != null && enipVar3.contains(valueOf)) {
                            return false;
                        }
                        enip enipVar4 = enipVar;
                        if ((enipVar4 != null && !enipVar4.contains(valueOf)) || !file2.isDirectory()) {
                            return false;
                        }
                        if (z) {
                            return file2.canWrite();
                        }
                        return true;
                    } catch (NumberFormatException unused) {
                        return false;
                    }
                }
            });
            if (listFiles != null) {
                engrVar.i(listFiles);
            }
        }
        return engrVar.g();
    }

    public final engw b(boolean z) {
        return a(null, enpd.a, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ListenableFuture c(engw engwVar) {
        final ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((enou) engwVar).c; i++) {
            arrayList.add(this.b.a((File) engwVar.get(i)));
        }
        return erqt.a(arrayList).a(new Callable() { // from class: ejen
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    erqt.q((ListenableFuture) it.next());
                }
                return null;
            }
        }, erpp.a);
    }
}
