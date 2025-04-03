package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.function.Consumer;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dilg {
    public static dilk a(byte[] bArr) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new ByteArrayInputStream(bArr), "utf-8");
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        newPullParser.nextTag();
        return dilk.a(newPullParser);
    }

    public static dilk b(Optional optional, dilk dilkVar, ctvb ctvbVar) {
        if (optional.isEmpty()) {
            dkty.c("Setting initial conference information", new Object[0]);
            dilkVar.e();
            return dilkVar;
        }
        dkty.c("Updating conference information", new Object[0]);
        dimh dimhVar = dilkVar.d;
        if (dimhVar != null) {
            dkty.c("%d users in update", Integer.valueOf(dimhVar.size()));
        } else {
            dkty.c("No user in update", new Object[0]);
        }
        final dilk dilkVar2 = (dilk) optional.get();
        if (TextUtils.isEmpty(dilkVar.g)) {
            dkty.q("Invalid conference info. Entity is empty.", new Object[0]);
        } else if (dilkVar.h == dimb.NONE) {
            dkty.q("Invalid conference info. State is none.", new Object[0]);
        } else if (dilkVar.h == dimb.FULL && ((dilkVar.d.isEmpty() && dilkVar.d.a == dimb.NONE) || !dilkVar.d.b() || dilkVar.a.isEmpty())) {
            dkty.q("A full conference document MUST at least include the conference description and users child elements.", new Object[0]);
        } else {
            int i = dilkVar.i;
            dimb dimbVar = dilkVar.h;
            if (dimbVar == dimb.PARTIAL) {
                int i2 = dilkVar2.i;
                if (i == i2) {
                    dkty.q("Version identical, skipping conference info update!", new Object[0]);
                } else {
                    if (i < i2) {
                        throw new dilj(a.x(i, i2, "Cannot update from ", " to ", ". Version of conference info update must not be smaller!"));
                    }
                    if (i - i2 > 1) {
                        throw new dilj(a.x(i, i2, "Cannot update from ", " to ", ". Missing previous update information!"));
                    }
                }
            }
            dilkVar2.i = i;
            int ordinal = dimbVar.ordinal();
            if (ordinal == 0) {
                dilkVar2.b = dilkVar.b;
                dilkVar2.c = dilkVar.c;
                dilkVar.a.ifPresent(new Consumer() { // from class: dili
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        dilf dilfVar = (dilf) obj;
                        Optional optional2 = dilk.this.a;
                        if (optional2.isEmpty()) {
                            return;
                        }
                        dilfVar.a((dilf) optional2.get());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                dilkVar2.a = dilkVar.a;
                dilkVar2.e = dilkVar.e;
                dilkVar2.f = dilkVar.f;
                dilkVar2.f(dilkVar, ctvbVar);
            } else if (ordinal == 1 || ordinal == 2) {
                if (dilkVar.a.isPresent()) {
                    if (dilkVar2.a.isPresent()) {
                        Object obj = dilkVar2.a.get();
                        dilf dilfVar = (dilf) dilkVar.a.get();
                        if (!TextUtils.isEmpty(dilfVar.a)) {
                            ((dilf) obj).a = dilfVar.a;
                        }
                        if (dilfVar.b.isPresent()) {
                            dilf dilfVar2 = (dilf) obj;
                            dilfVar2.a(dilfVar);
                            dilfVar2.b = dilfVar.b;
                            dilfVar2.c = dilfVar.c;
                        }
                        if (!TextUtils.isEmpty(dilfVar.d)) {
                            ((dilf) obj).d = dilfVar.d;
                        }
                        if (!TextUtils.isEmpty(dilfVar.e)) {
                            ((dilf) obj).e = dilfVar.e;
                        }
                        if (!dilfVar.f.isEmpty() && !dilfVar.f.a.equals(dimb.NONE)) {
                            ((dilf) obj).f = dilfVar.f;
                        }
                        if (!dilfVar.g.isEmpty() && !dilfVar.g.a.equals(dimb.NONE)) {
                            ((dilf) obj).g = dilfVar.g;
                        }
                        int i3 = dilfVar.h;
                        if (i3 > 0) {
                            ((dilf) obj).h = i3;
                        }
                        if (!dilfVar.i.isEmpty()) {
                            ((dilf) obj).i = dilfVar.i;
                        }
                    } else {
                        dilkVar2.a = dilkVar.a;
                        dilkVar2.a.get();
                    }
                }
                if (dilkVar.b.isPresent()) {
                    dilkVar2.b = dilkVar.b;
                }
                if (dilkVar.c.isPresent()) {
                    dilkVar2.c = dilkVar.c;
                }
                if (dilkVar2.e.isEmpty() && dilkVar2.e.a == dimb.NONE) {
                    dilkVar2.e = dilkVar.e;
                }
                if (dilkVar2.f.isEmpty() && dilkVar2.f.a == dimb.NONE) {
                    dilkVar2.f = dilkVar.f;
                }
                if (!dilkVar.d.isEmpty()) {
                    dilkVar2.f(dilkVar, ctvbVar);
                }
            } else {
                dkty.q("Unexpected conference info state %s", dilkVar.h);
            }
        }
        return (dilk) optional.get();
    }

    public static dilk c(Optional optional, String str, byte[] bArr, ctvb ctvbVar) {
        if (d(str, bArr)) {
            return b(optional, a(bArr), ctvbVar);
        }
        throw new IOException("Invalid conference information");
    }

    public static boolean d(String str, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            dkty.q("No content in notification", new Object[0]);
            return false;
        }
        if ("application/conference-info+xml".equalsIgnoreCase(str)) {
            return true;
        }
        dkty.q("Content-Type not matching: %s, expecting: %s", str, "application/conference-info+xml");
        return false;
    }
}
