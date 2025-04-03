package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class diao implements Runnable {
    final /* synthetic */ DataHolder a;
    final /* synthetic */ diax b;

    public diao(diax diaxVar, DataHolder dataHolder) {
        this.a = dataHolder;
        this.b = diaxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dhzl dhzlVar = new dhzl(this.a);
        try {
            this.b.a.j(dhzlVar);
        } finally {
            dhzlVar.b();
        }
    }
}
