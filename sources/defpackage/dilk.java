package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dilk {
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    public dimh d = new dimh(dimb.NONE);
    public dime e = new dime(dimb.NONE);
    public dilz f = new dilz(dimb.NONE);
    public final String g;
    public final dimb h;
    public int i;

    public dilk(dimb dimbVar, String str, int i) {
        this.h = dimbVar;
        this.g = str;
        this.i = i;
    }

    public static dilk a(XmlPullParser xmlPullParser) {
        return b(xmlPullParser, "conference-info");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0170, code lost:
    
        if (r8 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0172, code lost:
    
        r0 = "participant";
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017c, code lost:
    
        throw new java.lang.IllegalStateException("subject-ext is missing ".concat(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01da A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dilk b(org.xmlpull.v1.XmlPullParser r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 2928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dilk.b(org.xmlpull.v1.XmlPullParser, java.lang.String):dilk");
    }

    public final void c() {
        dimh dimhVar = this.d;
        if (dimhVar.isEmpty()) {
            return;
        }
        Iterator it = dimhVar.iterator();
        while (it.hasNext()) {
            dimg dimgVar = (dimg) it.next();
            if (!dimgVar.g() || !dimgVar.h()) {
                it.remove();
            }
            dilt diltVar = dilt.PENDING;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(XmlSerializer xmlSerializer, String str) {
        String str2;
        int i;
        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", str);
        String str3 = this.g;
        if (str3 != null) {
            xmlSerializer.attribute("", "entity", str3);
        }
        if (this.h != dimb.NONE) {
            xmlSerializer.attribute("", "state", this.h.e);
        }
        xmlSerializer.attribute("", BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, Integer.toString(this.i));
        if (this.a.isPresent()) {
            Object obj = this.a.get();
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "conference-description");
            dilf dilfVar = (dilf) obj;
            if (!dilfVar.a.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                xmlSerializer.text(dilfVar.a);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
            }
            if (dilfVar.b.isPresent() && !((String) dilfVar.b.get()).isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "subject");
                xmlSerializer.text((String) dilfVar.b.get());
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "subject");
            }
            if (dilfVar.c.isPresent()) {
                Object obj2 = dilfVar.c.get();
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "subject-ext");
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "participant");
                dimc dimcVar = (dimc) obj2;
                str2 = "entity";
                xmlSerializer.text(dimcVar.a);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "participant");
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "timestamp");
                Optional optional = dimcVar.b;
                if (optional.isPresent()) {
                    xmlSerializer.text(((dktc) optional.get()).toString());
                }
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "timestamp");
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "subject-ext");
            } else {
                str2 = "entity";
            }
            if (!dilfVar.d.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "free-text");
                xmlSerializer.text(dilfVar.d);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "free-text");
            }
            if (!dilfVar.e.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "keywords");
                xmlSerializer.text(dilfVar.e);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "keywords");
            }
            if (!dilfVar.f.isEmpty()) {
                dime dimeVar = dilfVar.f;
                if (dimeVar.a != dimb.NONE) {
                    dimeVar.b(xmlSerializer, "conf-uris");
                }
            }
            if (!dilfVar.g.isEmpty()) {
                dime dimeVar2 = dilfVar.g;
                if (dimeVar2.a != dimb.NONE) {
                    dimeVar2.b(xmlSerializer, "service-uris");
                }
            }
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "maximum-user-count");
            xmlSerializer.text(Integer.toString(dilfVar.h));
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "maximum-user-count");
            if (!dilfVar.i.isEmpty()) {
                dilm dilmVar = dilfVar.i;
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "available-media");
                int size = dilmVar.size();
                int i2 = 0;
                while (i2 < size) {
                    dill dillVar = (dill) dilmVar.get(i2);
                    xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "entry");
                    if (!dillVar.d.isEmpty()) {
                        xmlSerializer.attribute("", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, dillVar.d);
                    }
                    if (!dillVar.a.isEmpty()) {
                        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                        xmlSerializer.text(dillVar.a);
                        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                    }
                    if (!dillVar.b.isEmpty()) {
                        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                        xmlSerializer.text(dillVar.b);
                        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                    }
                    dilm dilmVar2 = dilmVar;
                    if (dillVar.c != dily.NONE) {
                        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "status");
                        xmlSerializer.text(dillVar.c.f);
                        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "status");
                    }
                    xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "entry");
                    i2++;
                    dilmVar = dilmVar2;
                }
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "available-media");
            }
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "conference-description");
        } else {
            str2 = "entity";
        }
        if (this.b.isPresent()) {
            Object obj3 = this.b.get();
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "host-info");
            dilv dilvVar = (dilv) obj3;
            if (!dilvVar.a.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                xmlSerializer.text(dilvVar.a);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
            }
            if (!dilvVar.b.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "web-page");
                xmlSerializer.text(dilvVar.b);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "web-page");
            }
            dilvVar.c.b(xmlSerializer, "uris");
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "host-info");
        }
        if (this.c.isPresent()) {
            Object obj4 = this.c.get();
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "conference-state");
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "user-count");
            diln dilnVar = (diln) obj4;
            xmlSerializer.text(Integer.toString(dilnVar.a));
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "user-count");
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "active");
            xmlSerializer.text(diln.a(dilnVar.b));
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "active");
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "locked");
            xmlSerializer.text(diln.a(dilnVar.c));
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "locked");
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "conference-state");
        }
        if (!this.d.isEmpty()) {
            dimh dimhVar = this.d;
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "users");
            dimb dimbVar = dimhVar.a;
            if (dimbVar != dimb.NONE && dimbVar != dimb.FULL) {
                xmlSerializer.attribute("", "state", dimbVar.e);
            }
            int size2 = dimhVar.size();
            int i3 = 0;
            while (i3 < size2) {
                dimg dimgVar = (dimg) dimhVar.get(i3);
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "user");
                String str4 = dimgVar.g;
                dimh dimhVar2 = dimhVar;
                String str5 = str2;
                if (str4 != null) {
                    xmlSerializer.attribute("", str5, str4);
                }
                dimb dimbVar2 = dimgVar.h;
                int i4 = size2;
                if (dimbVar2 != dimb.NONE) {
                    xmlSerializer.attribute("", "state", dimbVar2.e);
                }
                if (dimgVar.i) {
                    xmlSerializer.attribute("", "yourown", "true");
                }
                if (dimgVar.j) {
                    xmlSerializer.attribute("", "joined", "true");
                }
                if (dimgVar.a != null) {
                    xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                    xmlSerializer.text(dimgVar.a);
                    xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                }
                if (!dimgVar.b.isEmpty()) {
                    dimgVar.b.b(xmlSerializer, "associated-aors");
                }
                if (dimgVar.c.isEmpty()) {
                    i = i3;
                } else {
                    dimi dimiVar = dimgVar.c;
                    xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "roles");
                    int size3 = dimiVar.size();
                    i = i3;
                    int i5 = 0;
                    while (i5 < size3) {
                        dimi dimiVar2 = dimiVar;
                        String str6 = (String) dimiVar.get(i5);
                        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "entry");
                        xmlSerializer.text(str6);
                        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "entry");
                        i5++;
                        dimiVar = dimiVar2;
                    }
                    xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "roles");
                }
                if (dimgVar.d != null) {
                    xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "languages");
                    xmlSerializer.text(dimgVar.d);
                    xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "languages");
                }
                if (dimgVar.e != null) {
                    xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "cascaded-focus");
                    xmlSerializer.text(dimgVar.e);
                    xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "cascaded-focus");
                }
                if (!dimgVar.f.isEmpty()) {
                    int i6 = 0;
                    while (i6 < dimgVar.f.size()) {
                        dils dilsVar = (dils) dimgVar.f.get(i6);
                        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "endpoint");
                        String str7 = dilsVar.j;
                        if (str7 != null) {
                            xmlSerializer.attribute("", str5, str7);
                        }
                        dimb dimbVar3 = dilsVar.k;
                        String str8 = str5;
                        if (dimbVar3 != dimb.NONE && dimbVar3 != dimb.FULL) {
                            xmlSerializer.attribute("", "state", dimbVar3.e);
                        }
                        String str9 = dilsVar.a;
                        if (str9 != null) {
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                            xmlSerializer.text(str9);
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                        }
                        if (dilsVar.b.isPresent()) {
                            ((dilu) dilsVar.b.get()).b(xmlSerializer, "referred");
                        }
                        if (dilsVar.c != dilt.NONE) {
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "status");
                            xmlSerializer.text(dilsVar.c.k);
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "status");
                        }
                        if (dilsVar.d != dilw.UNKNOWN) {
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "joining-method");
                            xmlSerializer.text(dilsVar.d.e);
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "joining-method");
                        }
                        if (dilsVar.e.isPresent()) {
                            ((dilu) dilsVar.e.get()).b(xmlSerializer, "joining-info");
                        }
                        if (dilsVar.f != dilr.UNKNOWN) {
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "disconnection-method");
                            xmlSerializer.text(dilsVar.f.f);
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "disconnection-method");
                        }
                        if (dilsVar.g.isPresent()) {
                            ((dilu) dilsVar.g.get()).b(xmlSerializer, "disconnection-info");
                        }
                        Iterator it = dilsVar.h.iterator();
                        while (it.hasNext()) {
                            dilx dilxVar = (dilx) it.next();
                            Iterator it2 = it;
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "media");
                            int i7 = i6;
                            xmlSerializer.attribute("", "id", dilxVar.a);
                            if (dilxVar.b != null) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                                xmlSerializer.text(dilxVar.b);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                            }
                            if (dilxVar.c != null) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                                xmlSerializer.text(dilxVar.c);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                            }
                            if (dilxVar.d != null) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
                                xmlSerializer.text(dilxVar.d);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
                            }
                            if (dilxVar.e != null) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "src-id");
                                xmlSerializer.text(dilxVar.e);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "src-id");
                            }
                            if (dilxVar.f != dily.NONE) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "status");
                                xmlSerializer.text(dilxVar.f.f);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "status");
                            }
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "media");
                            it = it2;
                            i6 = i7;
                        }
                        int i8 = i6;
                        if (dilsVar.i.isPresent()) {
                            Object obj5 = dilsVar.i.get();
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "call-info");
                            dima dimaVar = ((dile) obj5).a;
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "sip");
                            if (!dimaVar.a.isEmpty()) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                                xmlSerializer.text(dimaVar.a);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                            }
                            if (!dimaVar.b.isEmpty()) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "call-id");
                                xmlSerializer.text(dimaVar.b);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "call-id");
                            }
                            if (!dimaVar.c.isEmpty()) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "from-tag");
                                xmlSerializer.text(dimaVar.c);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "from-tag");
                            }
                            if (!dimaVar.d.isEmpty()) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "to-tag");
                                xmlSerializer.text(dimaVar.d);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "to-tag");
                            }
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "sip");
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "call-info");
                        }
                        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "endpoint");
                        i6 = i8 + 1;
                        str5 = str8;
                    }
                }
                String str10 = str5;
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "user");
                i3 = i + 1;
                size2 = i4;
                dimhVar = dimhVar2;
                str2 = str10;
            }
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "users");
        }
        if (!this.e.isEmpty()) {
            this.e.b(xmlSerializer, "sidebars-by-ref");
        }
        if (!this.f.isEmpty()) {
            dilz dilzVar = this.f;
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "sidebars-by-val");
            dimb dimbVar4 = dilzVar.a;
            if (dimbVar4 != dimb.NONE && dimbVar4 != dimb.FULL) {
                xmlSerializer.attribute("", "state", dimbVar4.toString());
            }
            if (!dilzVar.isEmpty()) {
                int size4 = dilzVar.size();
                for (int i9 = 0; i9 < size4; i9++) {
                    ((dilk) dilzVar.get(i9)).d(xmlSerializer, "entry");
                }
            }
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "sidebars-by-val");
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void e() {
        dimh dimhVar = this.d;
        int size = dimhVar.size();
        for (int i = 0; i < size; i++) {
            ((dimg) dimhVar.get(i)).f();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dilk)) {
            return false;
        }
        dilk dilkVar = (dilk) obj;
        return TextUtils.equals(this.g, dilkVar.g) && this.i == dilkVar.i && this.h == dilkVar.h && this.a.equals(dilkVar.a) && this.c.equals(dilkVar.c) && this.b.equals(dilkVar.b) && this.e.equals(dilkVar.e) && this.f.equals(dilkVar.f) && this.d.equals(dilkVar.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(dilk dilkVar, ctvb ctvbVar) {
        if (this.d.isEmpty() && this.d.a == dimb.NONE) {
            this.d = dilkVar.d;
            e();
            return;
        }
        dimh dimhVar = this.d;
        dimh dimhVar2 = dilkVar.d;
        if (dimhVar2.b()) {
            dimb dimbVar = dimhVar2.a;
            if (dimbVar != dimb.FULL) {
                if (dimbVar == dimb.PARTIAL || dimbVar == dimb.DELETED) {
                    int size = dimhVar2.size();
                    for (int i = 0; i < size; i++) {
                        dimg dimgVar = (dimg) dimhVar2.get(i);
                        if (dimgVar.h()) {
                            Optional a = dimhVar.a(dimgVar.g, ctvbVar);
                            if (a.isEmpty()) {
                                dimhVar.add(dimgVar);
                                dimgVar.f();
                            } else {
                                ((dimg) a.get()).d(dimgVar, ctvbVar);
                            }
                        } else {
                            dkty.g("Skipping invalid user during partial update: %s", dimgVar);
                        }
                    }
                    return;
                }
                return;
            }
            int size2 = dimhVar.size();
            for (int i2 = 0; i2 < size2; i2++) {
                dimg dimgVar2 = (dimg) dimhVar.get(i2);
                Optional a2 = dimhVar2.a(dimgVar2.g, ctvbVar);
                if (a2.isPresent()) {
                    dimgVar2.d((dimg) a2.get(), ctvbVar);
                } else {
                    dimgVar2.c();
                }
            }
            int size3 = dimhVar2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                dimg dimgVar3 = (dimg) dimhVar2.get(i3);
                if (dimgVar3.h() && dimgVar3.g() && !dimhVar.a(dimgVar3.g, ctvbVar).isPresent()) {
                    dimhVar.add(dimgVar3);
                    dimgVar3.f();
                }
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.g, Integer.valueOf(this.i), this.h, this.a, this.c, this.b, this.e, this.d});
    }

    public final String toString() {
        return "Entity: " + dktx.USER_ID.c(this.g) + ", version: " + this.i + ", state: " + String.valueOf(this.h) + ", host info: " + String.valueOf(this.b) + ", users: " + String.valueOf(this.d) + ", conference state: " + String.valueOf(this.c) + ", conference description: " + String.valueOf(this.a);
    }
}
