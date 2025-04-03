package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a;
import defpackage.dfxk;
import defpackage.eidz;
import defpackage.eifb;
import defpackage.eifc;
import defpackage.eifd;
import defpackage.emvh;
import defpackage.emvk;
import defpackage.emvr;
import defpackage.emvs;
import defpackage.emvv;
import defpackage.emvz;
import defpackage.emxf;
import defpackage.enhd;
import defpackage.enhk;
import defpackage.enoz;
import defpackage.enqu;
import defpackage.enrr;
import defpackage.enru;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ContentType implements Parcelable {
    public static final Parcelable.Creator<ContentType> CREATOR;
    private static final enru a = enru.c("com/google/android/rcs/client/messaging/data/ContentType");
    private static final emvz b;
    private static final emvz c;
    public static final ContentType d;
    private static final emvz e;

    static {
        eifc d2 = d();
        d2.f("application");
        d2.e("octet-stream");
        d = d2.g();
        CREATOR = new eifb();
        b = new emvh(new emvh(new emvh(emvk.a, new emvv(emvs.a)), new emvr(' ')), emvz.m("()<>@,;:\\\"/[]?="));
        c = new emvh(emvk.a, emvz.m("\"\\\r"));
        e = emvz.l(" \t\r\n");
    }

    public static eifc d() {
        eidz eidzVar = new eidz();
        eidzVar.h(enoz.a);
        return eidzVar;
    }

    public static ContentType e(String str) {
        String b2;
        eifd eifdVar = new eifd(str);
        try {
            emvz emvzVar = b;
            String b3 = eifdVar.b(emvzVar);
            eifdVar.e('/');
            String c2 = eifdVar.c(emvzVar);
            enhd enhdVar = new enhd();
            while (eifdVar.d()) {
                emvz emvzVar2 = e;
                eifdVar.c(emvzVar2);
                eifdVar.e(';');
                eifdVar.c(emvzVar2);
                emvz emvzVar3 = b;
                String b4 = eifdVar.b(emvzVar3);
                eifdVar.e('=');
                if (eifdVar.a() == '\"') {
                    eifdVar.e('\"');
                    StringBuilder sb = new StringBuilder();
                    while (eifdVar.a() != '\"') {
                        if (eifdVar.a() == '\\') {
                            eifdVar.e('\\');
                            emvz emvzVar4 = emvk.a;
                            emxf.l(eifdVar.d());
                            char a2 = eifdVar.a();
                            emxf.l(emvzVar4.c(a2));
                            eifdVar.b++;
                            sb.append(a2);
                        } else {
                            sb.append(eifdVar.b(c));
                        }
                    }
                    b2 = sb.toString();
                    eifdVar.e('\"');
                } else {
                    b2 = eifdVar.b(emvzVar3);
                }
                enhdVar.k(b4, b2);
            }
            eifc d2 = d();
            d2.f(b3);
            d2.e(c2);
            d2.h(enhdVar.c());
            return d2.g();
        } catch (IllegalStateException e2) {
            throw new IllegalArgumentException(a.a(str, "Could not parse '", "'"), e2);
        }
    }

    public abstract enhk a();

    public abstract String b();

    public abstract String c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean f(ContentType contentType) {
        return contentType != null && c().equals(contentType.c()) && b().equals(contentType.b());
    }

    public final boolean g(String str) {
        if (str == null) {
            return false;
        }
        try {
            return f(e(str));
        } catch (IllegalArgumentException e2) {
            ((enrr) ((enrr) ((enrr) a.j()).g(e2)).h("com/google/android/rcs/client/messaging/data/ContentType", "describesSameContentAs", 116, "ContentType.java")).t("Failed to parse content type: %s", str);
            return false;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(c());
        sb.append('/');
        sb.append(b());
        enqu listIterator = a().entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            sb.append("; ");
            sb.append((String) entry.getKey());
            sb.append('=');
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = dfxk.a(parcel);
        dfxk.m(parcel, 1, toString(), false);
        dfxk.c(parcel, a2);
    }
}
