package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dift implements dfto {
    final /* synthetic */ DataHolder a;

    public dift(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // defpackage.dfto
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        DataHolder dataHolder = this.a;
        try {
            new dhzo(dataHolder);
            if (dataHolder != null) {
                dataHolder.close();
            }
        } catch (Throwable th) {
            if (dataHolder != null) {
                try {
                    dataHolder.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.dfto
    public final void b() {
        this.a.close();
    }
}
