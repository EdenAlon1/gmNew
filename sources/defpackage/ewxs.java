package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewxs {
    public final String a;
    public final String b;
    public final engi c;
    public final enyj d;
    public final engi e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final Float r;
    public final engi s;

    public ewxs(String str, String str2, engi engiVar, enyj enyjVar, engi engiVar2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Float f, engi engiVar3) {
        this.a = str;
        this.b = str2;
        this.c = engiVar;
        this.d = enyjVar;
        this.e = engiVar2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = str14;
        this.r = f;
        this.s = engiVar3;
    }

    public static ewxs a(ewxt ewxtVar) {
        Bundle deepCopy;
        ArrayList parcelableArrayList;
        deepCopy = ewxtVar.c.deepCopy();
        ewxn ewxnVar = new ewxn();
        ewxnVar.a = deepCopy.getString("textclassifier.extras.KG_MID");
        ewxnVar.b = deepCopy.getString("textclassifier.extras.KG_TITLE");
        ewxnVar.c = (enyj) deepCopy.getSerializable("textclassifier.extras.KG_LAT_LNG");
        ewxnVar.d = deepCopy.getString("textclassifier.extras.CONTACT_NAME");
        ewxnVar.e = deepCopy.getString("textclassifier.extras.CONTACT_GIVEN_NAME");
        ewxnVar.f = deepCopy.getString("textclassifier.extras.CONTACT_FAMILY_NAME");
        ewxnVar.g = deepCopy.getString("textclassifier.extras.CONTACT_NICKNAME");
        ewxnVar.h = deepCopy.getString("textclassifier.extras.CONTACT_EMAIL_ADDRESS");
        ewxnVar.i = deepCopy.getString("textclassifier.extras.CONTACT_PHONE_NUMBER");
        ewxnVar.j = deepCopy.getString("textclassifier.extras.CONTACT_ACCOUNT_TYPE");
        ewxnVar.k = deepCopy.getString("textclassifier.extras.CONTACT_ACCOUNT_NAME");
        ewxnVar.l = deepCopy.getString("textclassifier.extras.CONTACT_ALTERNATE_NAME");
        ewxnVar.m = deepCopy.getString("textclassifier.extras.CONTACT_ID");
        ewxnVar.n = deepCopy.getString("textclassifier.extras.APP_NAME");
        ewxnVar.o = deepCopy.getString("textclassifier.extras.APP_PACKAGE_NAME");
        ArrayList<String> stringArrayList = deepCopy.getStringArrayList("textclassifier.extras.KG_COLLECTION_HRIDS");
        if (stringArrayList != null) {
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                ewxnVar.c(stringArrayList.get(i));
            }
        }
        ArrayList parcelableArrayList2 = deepCopy.getParcelableArrayList("textclassifier.extras.KG_DEEPLINKS");
        if (parcelableArrayList2 != null) {
            int size2 = parcelableArrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ewxnVar.d((ewxr) parcelableArrayList2.get(i2));
            }
        }
        if (deepCopy.containsKey("textclassifier.extras.KG_TOPICALITY_SCORE")) {
            ewxnVar.p = Float.valueOf(deepCopy.getFloat("textclassifier.extras.KG_TOPICALITY_SCORE"));
        }
        if (deepCopy.containsKey("textclassifier.extras.BROADER_USER_INTERESTS") && (parcelableArrayList = deepCopy.getParcelableArrayList("textclassifier.extras.BROADER_USER_INTERESTS")) != null) {
            int size3 = parcelableArrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                ewxnVar.b((ewxm) parcelableArrayList.get(i3));
            }
        }
        return ewxnVar.a();
    }
}
