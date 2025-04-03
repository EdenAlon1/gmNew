package com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.bdhb;
import defpackage.bdus;
import defpackage.bduu;
import defpackage.bduw;
import defpackage.eyfy;
import defpackage.fbrd;
import defpackage.fbre;
import defpackage.fbrg;
import defpackage.fbri;
import defpackage.fbsm;
import defpackage.fbsq;
import defpackage.fbtl;
import defpackage.fbtw;
import defpackage.fbva;
import defpackage.fbwh;
import defpackage.fbwj;
import defpackage.fbwn;
import defpackage.fbwx;
import defpackage.fbwy;
import defpackage.fbwz;
import defpackage.fbxa;
import defpackage.fbxc;
import defpackage.ffkd;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class SmartSuggestionItemSuggestionData implements SmartSuggestionData {
    public static final Parcelable.Creator<SmartSuggestionItemSuggestionData> CREATOR = new bdus();
    public final String a;
    public bduw b;
    public fbxa c;

    public SmartSuggestionItemSuggestionData(fbxa fbxaVar, String str, bduw bduwVar) {
        this.a = str;
        this.b = bduwVar;
        this.c = fbxaVar;
    }

    @Override // defpackage.anzh
    public final String a() {
        fbxa fbxaVar = this.c;
        int i = fbxaVar.c;
        if (i == 15) {
            String str = ((fbwh) fbxaVar.d).b;
            str.getClass();
            return str;
        }
        if (i != 2) {
            return "";
        }
        String str2 = ((fbxc) fbxaVar.d).c;
        str2.getClass();
        return str2;
    }

    @Override // defpackage.anzh
    public final String b() {
        return this.a;
    }

    @Override // defpackage.anzh
    public final String c() {
        fbwy fbwyVar = this.c.e;
        if (fbwyVar == null) {
            fbwyVar = fbwy.b;
        }
        String str = fbwyVar.q;
        str.getClass();
        return str;
    }

    @Override // defpackage.anzh
    public final String d() {
        fbxa fbxaVar = this.c;
        fbxaVar.getClass();
        fbxc fbxcVar = fbxaVar.c == 2 ? (fbxc) fbxaVar.d : null;
        if (fbxcVar == null || (fbxcVar.b & 1) == 0) {
            return a();
        }
        String str = ((fbxc) fbxaVar.d).d;
        str.getClass();
        return str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.anzh
    public final String e() {
        fbwy fbwyVar = this.c.e;
        if (fbwyVar == null) {
            fbwyVar = fbwy.b;
        }
        fbri b = fbri.b(fbwyVar.l);
        if (b == null) {
            b = fbri.UNRECOGNIZED;
        }
        return b.name();
    }

    @Override // defpackage.anzh
    public final boolean f() {
        return bduu.c(this) || bduu.a(bduu.b(this)) == fbri.CATEGORY_EMOTIVE;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final float g() {
        fbwy fbwyVar = this.c.e;
        if (fbwyVar == null) {
            fbwyVar = fbwy.b;
        }
        return fbwyVar.f;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final int h() {
        fbxa fbxaVar = this.c;
        return (fbxaVar.c == 28 ? (fbwj) fbxaVar.d : fbwj.a).c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final long i() {
        fbxa fbxaVar = this.c;
        return (fbxaVar.c == 17 ? (fbwn) fbxaVar.d : fbwn.a).f;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final fbrd j() {
        fbwy fbwyVar = this.c.e;
        if (fbwyVar == null) {
            fbwyVar = fbwy.b;
        }
        fbrd b = fbrd.b(fbwyVar.d);
        if (b == null) {
            b = fbrd.UNRECOGNIZED;
        }
        b.getClass();
        return b;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final fbrg k() {
        fbwy fbwyVar = this.c.e;
        if (fbwyVar == null) {
            fbwyVar = fbwy.b;
        }
        fbrg b = fbrg.b(fbwyVar.g);
        if (b == null) {
            b = fbrg.UNRECOGNIZED;
        }
        b.getClass();
        return b;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final fbri l() {
        fbwy fbwyVar = this.c.e;
        if (fbwyVar == null) {
            fbwyVar = fbwy.b;
        }
        fbri b = fbri.b(fbwyVar.l);
        if (b == null) {
            b = fbri.UNRECOGNIZED;
        }
        b.getClass();
        return b;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final fbxa m() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String n() {
        fbxa fbxaVar = this.c;
        String str = (fbxaVar.c == 6 ? (fbsm) fbxaVar.d : fbsm.a).h;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String o() {
        fbxa fbxaVar = this.c;
        String str = (fbxaVar.c == 13 ? (fbtl) fbxaVar.d : fbtl.a).b;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String p() {
        fbxa fbxaVar = this.c;
        String str = (fbxaVar.c == 5 ? (fbtw) fbxaVar.d : fbtw.a).b;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String q() {
        fbxa fbxaVar = this.c;
        return (fbxaVar.c == 29 ? (fbsq) fbxaVar.d : fbsq.a).b;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String r() {
        fbxa fbxaVar = this.c;
        String str = (fbxaVar.c == 18 ? (fbva) fbxaVar.d : fbva.a).b;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String s() {
        fbxa fbxaVar = this.c;
        String str = (fbxaVar.c == 28 ? (fbwj) fbxaVar.d : fbwj.a).b;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String t() {
        fbxa fbxaVar = this.c;
        String str = (fbxaVar.c == 13 ? (fbtl) fbxaVar.d : fbtl.a).d;
        str.getClass();
        return str;
    }

    public final String toString() {
        Locale locale = Locale.US;
        fbwy fbwyVar = this.c.e;
        if (fbwyVar == null) {
            fbwyVar = fbwy.b;
        }
        Integer valueOf = Integer.valueOf(fbwyVar.l);
        fbwy fbwyVar2 = this.c.e;
        String str = (fbwyVar2 == null ? fbwy.b : fbwyVar2).m;
        if (fbwyVar2 == null) {
            fbwyVar2 = fbwy.b;
        }
        String format = String.format(locale, "{type=%d, targetMessageId=%s, suggestionId=%s}", Arrays.copyOf(new Object[]{valueOf, str, fbwyVar2.k}, 3));
        format.getClass();
        return format;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String u() {
        fbxa fbxaVar = this.c;
        String str = (fbxaVar.c == 13 ? (fbtl) fbxaVar.d : fbtl.a).c;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final void v(fbrd fbrdVar) {
        fbwy fbwyVar = this.c.e;
        if (fbwyVar == null) {
            fbwyVar = fbwy.b;
        }
        fbwx fbwxVar = (fbwx) fbwyVar.toBuilder();
        fbwxVar.copyOnWrite();
        ((fbwy) fbwxVar.instance).d = fbrdVar.a();
        eyfy build = fbwxVar.build();
        build.getClass();
        fbwz fbwzVar = (fbwz) this.c.toBuilder();
        fbwzVar.copyOnWrite();
        fbxa fbxaVar = (fbxa) fbwzVar.instance;
        fbxaVar.e = (fbwy) build;
        fbxaVar.b |= 1;
        fbxa fbxaVar2 = (fbxa) fbwzVar.build();
        fbxaVar2.getClass();
        this.c = fbxaVar2;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final boolean w() {
        return this.c.c == 12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(new ProtoParsers.InternalDontUse(null, this.c), 0);
        parcel.writeParcelable(new ProtoParsers.InternalDontUse(null, this.b), 0);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData
    public final MessageIdType x() {
        fbwy fbwyVar = this.c.e;
        if (fbwyVar == null) {
            fbwyVar = fbwy.b;
        }
        return bdhb.b(fbwyVar.m);
    }

    public final fbre y() {
        fbwy fbwyVar = this.c.e;
        if (fbwyVar == null) {
            fbwyVar = fbwy.b;
        }
        fbre b = fbre.b(fbwyVar.e);
        if (b == null) {
            b = fbre.UNRECOGNIZED;
        }
        b.getClass();
        return b;
    }

    public /* synthetic */ SmartSuggestionItemSuggestionData(fbxa fbxaVar, String str, bduw bduwVar, ffkd ffkdVar) {
        this(fbxaVar, str, bduwVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ SmartSuggestionItemSuggestionData(android.os.Parcel r3, defpackage.ffkd r4) {
        /*
            r2 = this;
            java.lang.Class<fbxa> r4 = defpackage.fbxa.class
            java.lang.ClassLoader r4 = r4.getClassLoader()
            android.os.Parcelable r4 = r3.readParcelable(r4)
            r4.getClass()
            eyjv r4 = (defpackage.eyjv) r4
            fbxa r0 = defpackage.fbxa.a
            eyfc r1 = defpackage.eyfc.a()
            eyhs r4 = r4.a(r0, r1)
            r4.getClass()
            fbxa r4 = (defpackage.fbxa) r4
            java.lang.Class<bduw> r0 = defpackage.bduw.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r0)
            r3.getClass()
            eyjv r3 = (defpackage.eyjv) r3
            bduw r0 = defpackage.bduw.a
            eyfc r1 = defpackage.eyfc.a()
            eyhs r3 = r3.a(r0, r1)
            r3.getClass()
            bduw r3 = (defpackage.bduw) r3
            r2.<init>(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData.<init>(android.os.Parcel, ffkd):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SmartSuggestionItemSuggestionData(defpackage.fbxa r3) {
        /*
            r2 = this;
            r3.getClass()
            bduw r0 = defpackage.bduw.a
            r0.getClass()
            java.lang.String r1 = ""
            r2.<init>(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData.<init>(fbxa):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmartSuggestionItemSuggestionData(fbxa fbxaVar, bduw bduwVar) {
        this(fbxaVar, "", bduwVar);
        fbxaVar.getClass();
        bduwVar.getClass();
    }

    public /* synthetic */ SmartSuggestionItemSuggestionData(fbxa fbxaVar, bduw bduwVar, int i, ffkd ffkdVar) {
        this(fbxaVar, (i & 2) != 0 ? bduw.a : bduwVar);
    }
}
