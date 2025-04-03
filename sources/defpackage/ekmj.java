package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekmj {
    public final errl a;
    private final ekmc b;

    public ekmj(ekmc ekmcVar, errl errlVar) {
        this.b = ekmcVar;
        this.a = errlVar;
    }

    public final erph a() {
        final ekmp ekmpVar = this.b.a;
        final Callable callable = new Callable() { // from class: ekmm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ekmp.b();
                ekmp ekmpVar2 = ekmp.this;
                try {
                    PrintWriter printWriter = ekmpVar2.h;
                    if (printWriter != null) {
                        printWriter.flush();
                    }
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    boolean z2 = false;
                    for (int i = 1; i <= ekmpVar2.g; i++) {
                        try {
                            File a = ekmpVar2.a(i);
                            if (a.exists()) {
                                arrayList.add(new FileInputStream(a));
                                if (z) {
                                    z = true;
                                    z2 = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                        } catch (Throwable th) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((InputStream) it.next()).close();
                            }
                            throw th;
                        }
                    }
                    File file = (File) ekmpVar2.d.get();
                    if (file.exists()) {
                        arrayList.add(new FileInputStream(file));
                    }
                    if (z2) {
                        arrayList.add(0, ekmp.c);
                    }
                    return new SequenceInputStream(Collections.enumeration(arrayList));
                } catch (IllegalArgumentException e) {
                    Log.e(ekmp.a, "Error while obtaining bytes from internal logs", e);
                    throw e;
                }
            }
        };
        return erph.c(new erov() { // from class: ekmn
            @Override // defpackage.erov
            public final Object a(erpc erpcVar) {
                String str = ekmp.a;
                InputStream inputStream = (InputStream) callable.call();
                erpcVar.a(inputStream, erpp.a);
                return inputStream;
            }
        }, ekmpVar.e);
    }
}
