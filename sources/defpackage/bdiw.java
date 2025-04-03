package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdiw {
    private static final cskc a = cskc.g("Bugle", "IntentConverter");
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/data/draft/IntentConverter");
    private final csum c;
    private final Context d;
    private final ffbr e;
    private final csuu f;
    private final akzt g;
    private final bcxm h;
    private final byzp i;
    private final ffbr j;

    public bdiw(csum csumVar, Context context, ffbr ffbrVar, csuu csuuVar, akzt akztVar, bcxm bcxmVar, byzp byzpVar, ffbr ffbrVar2) {
        this.c = csumVar;
        this.d = context;
        this.e = ffbrVar;
        this.f = csuuVar;
        this.g = akztVar;
        this.h = bcxmVar;
        this.i = byzpVar;
        this.j = ffbrVar2;
    }

    private final String f(Uri uri, String str) {
        if (le.x(str)) {
            return le.b(str);
        }
        if (uri == null || !this.f.s(str)) {
            return str;
        }
        String type = this.d.getContentResolver().getType(uri);
        if (type != null) {
            return type;
        }
        ctee cteeVar = (ctee) this.e.b();
        try {
            try {
                cteeVar.c(uri);
                String e = cteeVar.e();
                if (e != null) {
                    return e;
                }
            } catch (IOException e2) {
                csjy.k("Bugle", e2, a.G(uri, "Could not determine type of "));
            }
            return str;
        } finally {
            cteeVar.b();
        }
    }

    public final IncomingDraft a(Intent intent, aygq aygqVar) {
        try {
            return b(intent, aygqVar);
        } catch (bdiv unused) {
            return null;
        }
    }

    public final IncomingDraft b(Intent intent, aygq aygqVar) {
        final ArrayList arrayList;
        String str;
        enru enruVar = b;
        ensk e = enruVar.e();
        e.Y(ente.a, "IntentConverter");
        enrr enrrVar = (enrr) e;
        enrrVar.aa(ensy.SMALL);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/data/draft/IntentConverter", "convertIncomingDraftThrowInvalid", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "IntentConverter.java")).t("Converting intent to IncomingDraft %s", intent);
        String str2 = null;
        String str3 = (String) ctbd.a(intent).orElse(null);
        String stringExtra = intent.getStringExtra("android.intent.extra.SUBJECT");
        boolean z = false;
        boolean booleanExtra = intent.getBooleanExtra("extra_subject_mandatory", false);
        String action = intent.getAction();
        boolean z2 = true;
        if ("android.intent.action.SEND".equals(action) || "android.intent.action.SENDTO".equals(action) || "android.intent.action.VIEW".equals(action)) {
            arrayList = new ArrayList(1);
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
            if (uri != null) {
                arrayList.add(uri);
            }
        } else {
            if (!"android.intent.action.SEND_MULTIPLE".equals(action)) {
                ensk j = enruVar.j();
                j.Y(ente.a, "IntentConverter");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/data/draft/IntentConverter", "convertIncomingDraftThrowInvalid", 223, "IntentConverter.java")).t("Unsupported action type for sharing: %s", action);
                throw new bdiv("Unsupported action type for sharing: ".concat(String.valueOf(action)));
            }
            arrayList = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            try {
                String type = intent.getType();
                arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    boolean z3 = z;
                    Uri uri2 = (Uri) arrayList.get(i);
                    boolean z4 = z2;
                    String f = f(uri2, type);
                    cskc cskcVar = a;
                    String str4 = type;
                    String str5 = stringExtra;
                    int i2 = size;
                    Object[] objArr = new Object[3];
                    objArr[z3 ? 1 : 0] = uri2;
                    objArr[z4 ? 1 : 0] = str4;
                    objArr[2] = f;
                    cskcVar.m(String.format("createAttachmentsFromUris: uri=%s, defaultType=%s, finalType=%s", objArr));
                    if (uri2 == null) {
                        str = null;
                    } else {
                        if (csuu.v(uri2)) {
                            uri2 = this.c.b(uri2);
                        }
                        csum csumVar = this.c;
                        Context context = this.d;
                        uri2.getClass();
                        if (csumVar.f(context, uri2)) {
                            if (csuu.z(uri2)) {
                                this.g.c("Bugle.Share.InternalTelephonyMmsFile.AttachAborted");
                            } else {
                                this.g.c("Bugle.Share.InternalDataFile.AttachAborted");
                            }
                            throw new IllegalArgumentException("Cannot send private app data");
                        }
                        if (f == null || !le.q(f)) {
                            str = null;
                            Object[] objArr2 = new Object[3];
                            objArr2[z3 ? 1 : 0] = uri2;
                            objArr2[z4 ? 1 : 0] = str4;
                            objArr2[2] = f;
                            cskcVar.n(String.format("Unsupported content type: uri=%s, defaultType=%s, finalType=%s", objArr2));
                        } else {
                            str = null;
                            arrayList2.add(new IncomingDraft.Attachment(f, uri2, null));
                        }
                    }
                    i++;
                    type = str4;
                    str2 = str;
                    z2 = z4 ? 1 : 0;
                    z = z3 ? 1 : 0;
                    stringExtra = str5;
                    size = i2;
                }
            } catch (IllegalArgumentException e2) {
                ensk j2 = b.j();
                j2.Y(ente.a, "IntentConverter");
                ((enrr) ((enrr) ((enrr) j2).g(e2)).h("com/google/android/apps/messaging/shared/datamodel/data/draft/IntentConverter", "convertIncomingDraftThrowInvalid", 231, "IntentConverter.java")).t("Failed to create an attachment for %s", new enrw() { // from class: bdit
                    @Override // defpackage.enrw
                    public final Object a() {
                        Stream map = Collection.EL.stream(arrayList).map(new Function() { // from class: bdiu
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return cskt.f((Uri) obj);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i3 = engw.d;
                        return (engw) map.collect(endq.a);
                    }
                });
                throw new bdiv(e2);
            }
        }
        return aygw.a(aygqVar, str3, arrayList2, z2 != booleanExtra ? str2 : stringExtra);
    }

    @Deprecated
    public final MessageCoreData c(Intent intent) {
        ArrayList arrayList;
        String action = intent.getAction();
        String stringExtra = intent.getStringExtra("android.intent.extra.SUBJECT");
        boolean booleanExtra = intent.getBooleanExtra("extra_subject_mandatory", false);
        MessageCoreData messageCoreData = null;
        if ("android.intent.action.SEND".equals(action) || "android.intent.action.SENDTO".equals(action) || "android.intent.action.VIEW".equals(action)) {
            arrayList = new ArrayList(1);
            arrayList.add((Uri) intent.getParcelableExtra("android.intent.extra.STREAM"));
        } else {
            if (!"android.intent.action.SEND_MULTIPLE".equals(action)) {
                a.r("Unsupported action type for sharing: ".concat(String.valueOf(action)));
                return null;
            }
            arrayList = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        }
        MessageCoreData m = this.i.m((String) ctbd.a(intent).orElse(null));
        if (arrayList != null) {
            try {
                Iterator it = e(arrayList, intent.getType()).iterator();
                while (it.hasNext()) {
                    PendingAttachmentData pendingAttachmentData = (PendingAttachmentData) it.next();
                    eppq eppqVar = (eppq) eppr.a.createBuilder();
                    epqs epqsVar = (epqs) eprl.a.createBuilder();
                    String V = pendingAttachmentData.V();
                    epqsVar.copyOnWrite();
                    eprl eprlVar = (eprl) epqsVar.instance;
                    V.getClass();
                    eprlVar.b |= 8;
                    eprlVar.g = V;
                    dclc.h(eppqVar, epqsVar, pendingAttachmentData.m(), pendingAttachmentData.N());
                    pendingAttachmentData.h = (eppr) eppqVar.build();
                    m.aL(pendingAttachmentData);
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        messageCoreData = m;
        if (messageCoreData != null && stringExtra != null && booleanExtra) {
            messageCoreData.bG(stringExtra);
        }
        return messageCoreData;
    }

    public final bdiz d(Intent intent, aygq aygqVar) {
        ComposeRowState a2;
        if (!((atdn) this.j.b()).a()) {
            return new bdja(c(intent));
        }
        a2 = aygi.a(a(intent, aygqVar), 0);
        return new bdix(a2);
    }

    public final ArrayList e(ArrayList arrayList, String str) {
        PendingAttachmentData b2;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) arrayList.get(i);
            String f = f(uri, str);
            cskc cskcVar = a;
            cskcVar.m(String.format("createAttachmentsFromUris: uri=%s, defaultType=%s, finalType=%s", uri, str, f));
            if (uri != null) {
                if (csuu.v(uri)) {
                    uri = this.c.b(uri);
                }
                csum csumVar = this.c;
                Context context = this.d;
                uri.getClass();
                if (csumVar.f(context, uri)) {
                    if (csuu.z(uri)) {
                        this.g.c("Bugle.Share.InternalTelephonyMmsFile.AttachAborted");
                    } else {
                        this.g.c("Bugle.Share.InternalDataFile.AttachAborted");
                    }
                    throw new IllegalArgumentException("Cannot send private app data");
                }
                if (le.q(f)) {
                    if (le.i(f)) {
                        String m = csuu.m(this.d, uri);
                        long a2 = csuu.a(this.d, uri);
                        if (m != null && a2 > 0) {
                            b2 = this.h.c(f, uri, eohh.SHARE, m, a2);
                            arrayList2.add(b2);
                        }
                    }
                    b2 = this.h.b(f, uri, eohh.SHARE);
                    arrayList2.add(b2);
                } else {
                    cskcVar.n(String.format("Unsupported content type: uri=%s, defaultType=%s, finalType=%s", uri, str, f));
                }
            }
        }
        return arrayList2;
    }
}
