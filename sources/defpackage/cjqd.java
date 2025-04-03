package defpackage;

import android.content.ContentValues;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjqd extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ cjqe c;
    final /* synthetic */ cjpf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjqd(cjqe cjqeVar, cjpf cjpfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cjqeVar;
        this.d = cjpfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjqd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object c;
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
            c = obj;
        } else {
            ffci.b(obj);
            cjqe cjqeVar = this.c;
            cjpf cjpfVar = this.d;
            ContentValues contentValues = new ContentValues();
            cjow cjowVar = cjpfVar.c;
            cjqf cjqfVar = cjowVar.e;
            if (cjqfVar.a.length() > 0) {
                contentValues.put("subject", cjqfVar.a);
            }
            contentValues.put("sub_id", Integer.valueOf(cjqfVar.b));
            contentValues.put("reply_path_present", Integer.valueOf(cjqfVar.c ? 1 : 0));
            if (cjqfVar.d.length() > 0) {
                contentValues.put("service_center", cjqfVar.d);
            }
            contentValues.put("protocol", Integer.valueOf(cjqfVar.e));
            contentValues.put("address", cjowVar.b.j());
            if (cjqeVar.a.V()) {
                contentValues.put("date_sent", Long.valueOf(cjowVar.c.toEpochMilli()));
            }
            contentValues.put("date", Long.valueOf(cjowVar.d.toEpochMilli()));
            contentValues.put("body", cjowVar.a);
            contentValues.put("m_cls", Integer.valueOf(cjowVar.f - 1));
            contentValues.put("error_code", (Integer) 0);
            cjqe cjqeVar2 = this.c;
            cjpf cjpfVar2 = this.d;
            long j = cjpfVar2.a;
            batc batcVar = cjqeVar2.b;
            cjqf cjqfVar2 = cjpfVar2.c.e;
            elfl e = batcVar.e(cjqfVar2.b, contentValues, j, cjqfVar2.f);
            this.a = contentValues;
            this.b = 1;
            c = fgfz.c(e, this);
            if (c == ffhhVar) {
                return ffhhVar;
            }
            obj2 = contentValues;
        }
        basx basxVar = (basx) c;
        cjoq cjoqVar = new cjoq(basxVar.h(), new cpxu(basxVar.d()), basxVar.n());
        cjov cjovVar = new cjov(basxVar.o(), basxVar.m(), basxVar.q(), ctid.h(this.c.c), basxVar.j(), basxVar.f(), null);
        cjpf cjpfVar3 = this.d;
        return new cjpb(cjpfVar3.a, cjpfVar3.b, cjpfVar3.c, cjoqVar, cjovVar, (ContentValues) obj2);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjqd(this.c, this.d, ffguVar);
    }
}
