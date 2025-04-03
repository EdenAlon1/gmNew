package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exjt implements evbl {
    public final engw h;
    public final enip i;
    private final enhk l;
    public static final ecda a = new ecda("google.maps.places.v1.Places.");
    private static final ecda j = new ecda("google.maps.places.v1.Places/");
    public static final evbk b = new exjo();
    public static final evbk c = new exjp();
    public static final evbk d = new exjq();
    public static final evbk e = new exjr();
    public static final evbk f = new exjs();
    public static final exjt g = new exjt();
    private static final ecda k = new ecda("places.googleapis.com");

    private exjt() {
        int i = engw.d;
        engr engrVar = new engr();
        engrVar.h("autopush-places.mtls.sandbox.googleapis.com");
        engrVar.h("autopush-places.sandbox.googleapis.com");
        engrVar.h("localenterpriseloadtest-places.mtls.sandbox.googleapis.com");
        engrVar.h("localenterpriseloadtest-places.sandbox.googleapis.com");
        engrVar.h("places.mtls.googleapis.com");
        engrVar.h("prodenterpriseloadtest-places.googleapis.com");
        engrVar.h("prodenterpriseloadtest-places.mtls.googleapis.com");
        engrVar.h("prodlocal-places.mtls.sandbox.googleapis.com");
        engrVar.h("prodlocal-places.sandbox.googleapis.com");
        engrVar.h("staging-places.mtls.sandbox.googleapis.com");
        engrVar.h("staging-places.sandbox.googleapis.com");
        engrVar.h("places.googleapis.com");
        this.h = engrVar.g();
        this.i = new enin().g();
        evbk evbkVar = b;
        evbk evbkVar2 = c;
        evbk evbkVar3 = d;
        evbk evbkVar4 = e;
        evbk evbkVar5 = f;
        enip.u(evbkVar, evbkVar2, evbkVar3, evbkVar4, evbkVar5);
        enhd enhdVar = new enhd();
        enhdVar.k("SearchNearby", evbkVar);
        enhdVar.k("SearchText", evbkVar2);
        enhdVar.k("GetPhotoMedia", evbkVar3);
        enhdVar.k("GetPlace", evbkVar4);
        enhdVar.k("AutocompletePlaces", evbkVar5);
        this.l = enhdVar.c();
        new enhd().c();
    }

    @Override // defpackage.evbl
    public final ecda a() {
        return k;
    }

    @Override // defpackage.evbl
    public final evbk b(String str) {
        String str2 = j.a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.l.containsKey(substring)) {
            return (evbk) this.l.get(substring);
        }
        return null;
    }
}
