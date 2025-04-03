package com.google.android.libraries.onegoogle.owners.mdi;

import android.accounts.Account;
import android.content.Context;
import com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.dydd;
import defpackage.ebun;
import defpackage.ebwg;
import defpackage.elfr;
import defpackage.emwl;
import defpackage.eroh;
import defpackage.erpp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MdiOwnersLoader {
    public final dydd a;
    public final ebwg b;
    private final ebun c;
    private final String d;

    /* compiled from: PG */
    public static class MdiException extends Exception {
        public MdiException(String str) {
            super(str);
        }
    }

    public MdiOwnersLoader(Context context, dydd dyddVar, ebwg ebwgVar, ebun ebunVar) {
        this.a = dyddVar;
        this.b = ebwgVar;
        this.c = ebunVar;
        this.d = context.getPackageName();
    }

    public final ListenableFuture a(final emwl emwlVar) {
        return elfr.k(this.b.a(), new eroh() { // from class: ebyb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final List list = (List) obj;
                final ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    final MdiOwnersLoader mdiOwnersLoader = MdiOwnersLoader.this;
                    if (!it.hasNext()) {
                        return elfr.a(arrayList).a(new Callable() { // from class: ebya
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                List list2 = list;
                                int size = list2.size();
                                engr d = engw.d(size);
                                for (int i = 0; i < size; i++) {
                                    List list3 = arrayList;
                                    MdiOwnersLoader mdiOwnersLoader2 = MdiOwnersLoader.this;
                                    ebwl m = ebwn.m();
                                    m.b(((Account) list2.get(i)).name);
                                    mdiOwnersLoader2.b(m, (ListenableFuture) list3.get(i));
                                    d.h(m.a());
                                }
                                return d.g();
                            }
                        }, erpp.a);
                    }
                    arrayList.add((ListenableFuture) emwlVar.apply(mdiOwnersLoader.a.a((Account) it.next())));
                }
            }
        }, erpp.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013a A[Catch: all -> 0x001e, TryCatch #2 {all -> 0x001e, blocks: (B:3:0x000d, B:5:0x0017, B:9:0x0027, B:11:0x002f, B:12:0x0038, B:14:0x0044, B:15:0x0046, B:17:0x0050, B:20:0x0085, B:23:0x009e, B:26:0x00a3, B:28:0x00ab, B:30:0x00ba, B:31:0x00be, B:33:0x00c7, B:34:0x00cb, B:36:0x00d4, B:37:0x00d6, B:40:0x00db, B:42:0x00e1, B:44:0x00e5, B:45:0x00ed, B:46:0x00f4, B:48:0x00fc, B:51:0x0123, B:56:0x0114, B:57:0x0119, B:58:0x011e, B:65:0x0128, B:67:0x013a, B:72:0x014d, B:73:0x0157, B:74:0x0158, B:75:0x0162, B:76:0x0163), top: B:2:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.ebwl r13, com.google.common.util.concurrent.ListenableFuture r14) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader.b(ebwl, com.google.common.util.concurrent.ListenableFuture):void");
    }
}
