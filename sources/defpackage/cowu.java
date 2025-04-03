package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cowu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ coww b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cowu(ffgu ffguVar, coww cowwVar, MessageCoreData messageCoreData, int i, int i2) {
        super(2, ffguVar);
        this.b = cowwVar;
        this.c = messageCoreData;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cowu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        coww cowwVar = this.b;
        MessageCoreData messageCoreData = this.c;
        int i2 = this.d;
        int i3 = this.e;
        this.a = 1;
        Object c = cowwVar.c(messageCoreData, i2, i3, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cowu cowuVar = new cowu(ffguVar, this.b, this.c, this.d, this.e);
        cowuVar.f = obj;
        return cowuVar;
    }
}
