package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upg {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final cqoh d;

    public upg(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cqoh cqohVar) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = cqohVar;
    }

    public final void a() {
        if (!((alwa) this.c.b()).b()) {
            ((alwa) this.c.b()).a();
            return;
        }
        long e = ((ctyx) this.a.b()).e("last_opened_media_picker_time_millis", -1L);
        long epochMilli = this.d.f().toEpochMilli();
        if (e <= 0 || e >= epochMilli) {
            return;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eonj eonjVar = (eonj) eonk.a.createBuilder();
        eonjVar.copyOnWrite();
        eonk eonkVar = (eonk) eonjVar.instance;
        eonkVar.b |= 4;
        eonkVar.e = epochMilli - e;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eonk eonkVar2 = (eonk) eonjVar.build();
        eonkVar2.getClass();
        eolvVar.u = eonkVar2;
        eolvVar.b |= 8192;
        ((akxl) this.b.b()).j(eoluVar);
    }
}
