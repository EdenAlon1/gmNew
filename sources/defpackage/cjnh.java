package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjnh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjni b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ awui d;
    final /* synthetic */ awzn e;
    final /* synthetic */ awwf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjnh(cjni cjniVar, MessageCoreData messageCoreData, awui awuiVar, awzn awznVar, awwf awwfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjniVar;
        this.c = messageCoreData;
        this.d = awuiVar;
        this.e = awznVar;
        this.f = awwfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjnh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cjni cjniVar = this.b;
        MessageCoreData messageCoreData = this.c;
        awui awuiVar = this.d;
        awzn awznVar = this.e;
        awwf awwfVar = this.f;
        this.a = 1;
        Object a = cjniVar.a.a(messageCoreData, awuiVar, awznVar, awwfVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjnh(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
