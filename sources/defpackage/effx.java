package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class effx implements eroh {
    public final List a;
    public final Executor b;

    public effx(List list, Executor executor) {
        this.a = list;
        this.b = executor;
    }

    @Override // defpackage.eroh
    public final /* synthetic */ ListenableFuture a(Object obj) {
        final int i = ((enou) this.a).c;
        final efic eficVar = (efic) obj;
        final ArrayList arrayList = new ArrayList(i);
        enqv it = ((engw) this.a).iterator();
        while (it.hasNext()) {
            arrayList.add(((effs) it.next()).c());
        }
        final eroh d = eldl.d(new eroh() { // from class: effv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                final List list = arrayList;
                final eyhs eyhsVar = (eyhs) obj2;
                erqp a = erqt.a(list);
                final effx effxVar = effx.this;
                final int i2 = i;
                return a.b(eldl.c(new erog() { // from class: effu
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        ListenableFuture i3 = erqt.i(eyhsVar);
                        for (int i4 = 0; i4 < i2; i4++) {
                            if (((Boolean) erqt.q((Future) list.get(i4))).booleanValue()) {
                                final effs effsVar = (effs) effx.this.a.get(i4);
                                i3 = erny.g(i3, eldl.d(new eroh() { // from class: efft
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        return effs.this.b((eyhs) obj3);
                                    }
                                }), erpp.a);
                            }
                        }
                        return i3;
                    }
                }), effxVar.b);
            }
        });
        ekyr ekyrVar = eficVar.a.e;
        final erpp erppVar = erpp.a;
        ekyrVar.a();
        return erny.g(efih.a(erny.g(erqt.j(eficVar.a.c.c()), eldl.d(new eroh() { // from class: efib
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                return efic.this.a.b.h(d, erppVar);
            }
        }), erpp.a)), eldl.d(new eroh() { // from class: effw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                int i2 = i;
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    if (((Boolean) erqt.q((Future) arrayList.get(i3))).booleanValue()) {
                        arrayList2.add(((effs) effx.this.a.get(i3)).a());
                    }
                }
                return erqt.c(arrayList2).a(new eroi(null), erpp.a);
            }
        }), erpp.a);
    }
}
