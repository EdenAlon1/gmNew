package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbkz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fgjb b;
    final /* synthetic */ cblf c;
    final /* synthetic */ MessageId d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbkz(ffgu ffguVar, fgjb fgjbVar, cblf cblfVar, MessageId messageId) {
        super(2, ffguVar);
        this.b = fgjbVar;
        this.c = cblfVar;
        this.d = messageId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbkz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        fgjb fgjbVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            fgjbVar = (fgjb) this.e;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            fgjb fgjbVar2 = this.b;
            this.e = fgjbVar2;
            this.a = 1;
            if (fgjbVar2.a(null, this) == ffhhVar) {
                return ffhhVar;
            }
            fgjbVar = fgjbVar2;
        }
        try {
            return (cqpu) this.c.c.get(this.d);
        } finally {
            fgjbVar.b(null);
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cbkz cbkzVar = new cbkz(ffguVar, this.b, this.c, this.d);
        cbkzVar.e = obj;
        return cbkzVar;
    }
}
