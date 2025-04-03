package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvjr implements emwl {
    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        exwv exwvVar = (exwv) obj;
        evwi evwiVar = (evwi) evwj.a.createBuilder();
        if ((exwvVar.b & 1) != 0) {
            int i = exwvVar.c;
            evwiVar.copyOnWrite();
            evwj evwjVar = (evwj) evwiVar.instance;
            evwjVar.b |= 1;
            evwjVar.c = i;
        }
        if ((exwvVar.b & 2) != 0) {
            int i2 = exwvVar.d;
            evwiVar.copyOnWrite();
            evwj evwjVar2 = (evwj) evwiVar.instance;
            evwjVar2.b |= 2;
            evwjVar2.d = i2;
        }
        if ((exwvVar.b & 4) != 0) {
            String str = exwvVar.e;
            evwiVar.copyOnWrite();
            evwj evwjVar3 = (evwj) evwiVar.instance;
            str.getClass();
            evwjVar3.b |= 4;
            evwjVar3.e = str;
        }
        return (evwj) evwiVar.build();
    }
}
