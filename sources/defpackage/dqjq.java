package defpackage;

import android.database.Cursor;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqjq extends ffhv implements ffji {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ Cursor e;
    final /* synthetic */ dqjz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqjq(Cursor cursor, dqjz dqjzVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.e = cursor;
        this.f = dqjzVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object dqgmVar;
        Object obj2;
        Object obj3;
        ffhh ffhhVar = ffhh.a;
        if (this.d != 0) {
            obj3 = this.c;
            obj2 = this.b;
            dqgmVar = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            dqgmVar = new dqgm(this.e.getLong(1));
            Instant ofEpochMilli = Instant.ofEpochMilli(this.e.getLong(2));
            ofEpochMilli.getClass();
            String string = !this.e.isNull(3) ? this.e.getString(3) : null;
            dqjz dqjzVar = this.f;
            String string2 = this.e.getString(0);
            string2.getClass();
            this.a = dqgmVar;
            this.b = ofEpochMilli;
            this.c = string;
            this.d = 1;
            Object a = dqjzVar.e.c.a(string2, this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
            obj2 = ofEpochMilli;
            obj = a;
            obj3 = string;
        }
        return new dqij(obj, (dqgm) dqgmVar, (Instant) obj2, (String) obj3);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dqjq(this.e, this.f, (ffgu) obj).b(ffcu.a);
    }
}
