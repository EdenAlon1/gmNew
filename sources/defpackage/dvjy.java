package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dvjy implements emwl {
    public abstract void a(eyas eyasVar, evzx evzxVar);

    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        eyas eyasVar = (eyas) obj;
        evzx evzxVar = (evzx) ewab.a.createBuilder();
        if (eyasVar.c == 6 && eyap.a(6) == 7) {
            String str = (String) eyasVar.d;
            evzxVar.copyOnWrite();
            ewab ewabVar = (ewab) evzxVar.instance;
            str.getClass();
            ewabVar.c = 1;
            ewabVar.d = str;
        }
        if (eyasVar.c == 7 && eyap.a(7) == 8) {
            String str2 = (String) eyasVar.d;
            evzxVar.copyOnWrite();
            ewab ewabVar2 = (ewab) evzxVar.instance;
            str2.getClass();
            ewabVar2.c = 8;
            ewabVar2.d = str2;
        }
        if (eyasVar.c == 8 && eyap.a(8) == 9) {
            Integer num = (Integer) eyasVar.d;
            num.intValue();
            evzxVar.copyOnWrite();
            ewab ewabVar3 = (ewab) evzxVar.instance;
            ewabVar3.c = 9;
            ewabVar3.d = num;
        }
        b(eyasVar, evzxVar);
        g(eyasVar, evzxVar);
        if ((eyasVar.b & 1) != 0) {
            d(eyasVar, evzxVar);
        }
        if ((eyasVar.b & 2) != 0) {
            c(eyasVar, evzxVar);
        }
        e(eyasVar, evzxVar);
        a(eyasVar, evzxVar);
        f(eyasVar, evzxVar);
        return (ewab) evzxVar.build();
    }

    public abstract void b(eyas eyasVar, evzx evzxVar);

    public abstract void c(eyas eyasVar, evzx evzxVar);

    public abstract void d(eyas eyasVar, evzx evzxVar);

    public abstract void e(eyas eyasVar, evzx evzxVar);

    public abstract void f(eyas eyasVar, evzx evzxVar);

    public abstract void g(eyas eyasVar, evzx evzxVar);
}
