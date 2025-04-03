package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewmr implements evbl {
    public final engw p;
    public final enip q;
    private final enhk t;
    public static final ecda a = new ecda("google.internal.contactsui.v1.CustardService.");
    private static final ecda r = new ecda("google.internal.contactsui.v1.CustardService/");
    public static final evbk b = new ewmi();
    public static final evbk c = new ewmj();
    public static final evbk d = new ewmk();
    public static final evbk e = new ewml();
    public static final evbk f = new ewmm();
    public static final evbk g = new ewmn();
    public static final evbk h = new ewmo();
    public static final evbk i = new ewmp();
    public static final evbk j = new ewmq();
    public static final evbk k = new ewme();
    public static final evbk l = new ewmf();
    public static final evbk m = new ewmg();
    public static final evbk n = new ewmh();
    public static final ewmr o = new ewmr();
    private static final ecda s = new ecda("contactsui-pa.googleapis.com");

    private ewmr() {
        int i2 = engw.d;
        engr engrVar = new engr();
        engrVar.h("autopush-contactsui-pa.sandbox.googleapis.com");
        engrVar.h("staging-contactsui-pa.sandbox.googleapis.com");
        engrVar.h("contactsui-pa.googleapis.com");
        this.p = engrVar.g();
        enin eninVar = new enin();
        eninVar.c("https://www.googleapis.com/auth/peopleapi.readonly");
        eninVar.c("https://www.googleapis.com/auth/peopleapi.readwrite");
        eninVar.c("https://www.googleapis.com/auth/plus.peopleapi.readwrite");
        this.q = eninVar.g();
        evbk evbkVar = b;
        evbk evbkVar2 = c;
        evbk evbkVar3 = d;
        evbk evbkVar4 = e;
        evbk evbkVar5 = f;
        evbk evbkVar6 = g;
        evbk evbkVar7 = h;
        evbk evbkVar8 = i;
        evbk evbkVar9 = j;
        evbk evbkVar10 = k;
        evbk evbkVar11 = l;
        evbk evbkVar12 = m;
        evbk evbkVar13 = n;
        enip.v(evbkVar, evbkVar2, evbkVar3, evbkVar4, evbkVar5, evbkVar6, evbkVar7, evbkVar8, evbkVar9, evbkVar10, evbkVar11, evbkVar12, evbkVar13);
        enhd enhdVar = new enhd();
        enhdVar.k("GetProfileLimitedProfileUiData", evbkVar);
        enhdVar.k("PatchProfileLimitedProfileUiData", evbkVar2);
        enhdVar.k("GetProfilePhotoState", evbkVar3);
        enhdVar.k("ListProfilePhotosPhotoSuggestions", evbkVar4);
        enhdVar.k("ListProfilePhotosClusterSuggestions", evbkVar5);
        enhdVar.k("ListArchivedProfilePhotos", evbkVar6);
        enhdVar.k("GetProfilePhotoArtCollectionImages", evbkVar7);
        enhdVar.k("GetProfilePhotoArtFullImage", evbkVar8);
        enhdVar.k("GetProfilePhotoArtHomeSuggestions", evbkVar9);
        enhdVar.k("GetSearchInterests", evbkVar10);
        enhdVar.k("SearchProfilePhotoArt", evbkVar11);
        enhdVar.k("ListProfilePhotoArtSearchSuggestions", evbkVar12);
        enhdVar.k("ListProfilePhotoArtCollectionsByCategory", evbkVar13);
        this.t = enhdVar.c();
        new enhd().c();
    }

    @Override // defpackage.evbl
    public final ecda a() {
        return s;
    }

    @Override // defpackage.evbl
    public final evbk b(String str) {
        String str2 = r.a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.t.containsKey(substring)) {
            return (evbk) this.t.get(substring);
        }
        return null;
    }
}
