package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yot extends ffhv implements ffjp {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ you e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yot(you youVar, ffgu ffguVar) {
        super(5, ffguVar);
        this.e = youVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        dmqe dmqeVar;
        ffci.b(obj);
        ?? r2 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        you youVar = this.e;
        if (obj3 != null) {
            xlu xluVar = (xlu) obj3;
            if (xluVar.b == 1) {
                String string = youVar.b.getString(R.string.single_message_counter, new Integer(xluVar.a));
                string.getClass();
                dmqeVar = new dmqe(string, xluVar.c);
            } else {
                String string2 = youVar.b.getString(R.string.multiple_messages_counter, new Integer(xluVar.a), new Integer(xluVar.b));
                string2.getClass();
                dmqeVar = new dmqe(string2, xluVar.c);
            }
        } else {
            dmqeVar = null;
        }
        dmqe dmqeVar2 = dmqeVar;
        dsjn dsjnVar = youVar.m;
        you youVar2 = this.e;
        return new dmmp(dsjnVar, (CharSequence) r2, (String) obj2, (Integer) obj4, true, dmqeVar2, new dmmo(youVar2.g.a(), youVar2.h.a(), youVar2.j.a()));
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        yot yotVar = new yot(this.e, (ffgu) obj5);
        yotVar.a = (String) obj;
        yotVar.b = (String) obj2;
        yotVar.c = (xlu) obj3;
        yotVar.d = (Integer) obj4;
        return yotVar.b(ffcu.a);
    }
}
