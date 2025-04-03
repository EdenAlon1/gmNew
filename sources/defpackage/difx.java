package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class difx implements dfto {
    final /* synthetic */ DataHolder a;

    public difx(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // defpackage.dfto
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            ((dhzh) obj).j(new dhzl(this.a));
        } finally {
            this.a.close();
        }
    }

    @Override // defpackage.dfto
    public final void b() {
        this.a.close();
    }
}
