package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import java.io.File;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aikv implements aigt {
    private final Context a;
    private final eisx b;
    private final ahtu c;
    private final cbgh d;
    private final athf e;

    public aikv(Context context, eisx eisxVar, ahtu ahtuVar, cbgh cbghVar, athf athfVar) {
        eisxVar.getClass();
        cbghVar.getClass();
        this.a = context;
        this.b = eisxVar;
        this.c = ahtuVar;
        this.d = cbghVar;
        this.e = athfVar;
    }

    private final Uri b(Uri uri) {
        if (!ffkj.e(uri.getScheme(), "file")) {
            if (this.e.a()) {
                ((enrr) aikw.a.e().h("com/google/android/apps/messaging/navigation/targets/ForwardMessage$ForwardMessageNavigationHandler", "convertFileToContentUri", 185, "ForwardMessage.kt")).t("original forward URI: %s", cskw.d(uri));
            }
            return uri;
        }
        ((enrr) aikw.a.h().h("com/google/android/apps/messaging/navigation/targets/ForwardMessage$ForwardMessageNavigationHandler", "convertFileToContentUri", 161, "ForwardMessage.kt")).t("Converting forwarding file URI to a content URI: %s", cskw.d(uri));
        String path = uri.getPath();
        if (path == null) {
            ((enrr) aikw.a.i().h("com/google/android/apps/messaging/navigation/targets/ForwardMessage$ForwardMessageNavigationHandler", "convertFileToContentUri", 165, "ForwardMessage.kt")).q("Forwarded URI has no path, aborting content URI conversion");
            return uri;
        }
        final File file = new File(path);
        try {
            Uri a = FileProvider.a(this.a, this.d.a, file);
            if (this.e.a()) {
                enrr enrrVar = (enrr) aikw.a.e().h("com/google/android/apps/messaging/navigation/targets/ForwardMessage$ForwardMessageNavigationHandler", "convertFileToContentUri", 179, "ForwardMessage.kt");
                a.getClass();
                enrrVar.t("Forwarding file content URI: %s", cskw.d(a));
            }
            a.getClass();
            return a;
        } catch (IllegalArgumentException e) {
            if (this.e.a()) {
                ((enrr) aikw.a.e().h("com/google/android/apps/messaging/navigation/targets/ForwardMessage$ForwardMessageNavigationHandler", "convertFileToContentUri", 174, "ForwardMessage.kt")).t("Forwarding file exists: %b", ffca.a(new ffix() { // from class: aiku
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return Boolean.valueOf(file.exists());
                    }
                }));
            }
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aigt
    public final /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        IncomingDraft incomingDraft;
        IncomingDraft incomingDraft2;
        String c;
        aikw aikwVar = (aikw) aihsVar;
        Activity a = ddxb.a(this.a);
        if (a == null) {
            throw new IllegalArgumentException("multi-share must be created with an activity context.");
        }
        ahtu ahtuVar = this.c;
        eisx eisxVar = this.b;
        appj appjVar = aikwVar.b;
        Object obj = null;
        if (appjVar instanceof appo) {
            aygq aygqVar = aygq.d;
            appo appoVar = (appo) appjVar;
            String c2 = appoVar.c();
            String str = (c2 == null || c2.length() == 0) ? null : c2;
            engw a2 = appoVar.a();
            ArrayList arrayList = new ArrayList(ffdx.n(a2, 10));
            enqv it = a2.iterator();
            while (it.hasNext()) {
                apmq apmqVar = (apmq) it.next();
                String b = apmqVar.b();
                b.getClass();
                arrayList.add(new IncomingDraft.Attachment(b, apmqVar.e(), null));
            }
            incomingDraft2 = new IncomingDraft(aygqVar, str, arrayList, null, false, null, null, true, 120, null);
        } else if (appjVar instanceof appz) {
            aygq aygqVar2 = aygq.d;
            appz appzVar = (appz) appjVar;
            String c3 = appzVar.c();
            incomingDraft2 = new IncomingDraft(aygqVar2, (c3 == null || c3.length() == 0) ? null : c3, null, appzVar.d(), appzVar.e(), null, null, false, 228, null);
        } else if (appjVar instanceof appw) {
            if (((Boolean) ((cfup) ctjd.aC.get()).e()).booleanValue()) {
                aygq aygqVar3 = aygq.d;
                appw appwVar = (appw) appjVar;
                engw a3 = appwVar.a();
                a3.getClass();
                enqv it2 = a3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((apcy) next).c() == appv.ORIGINAL_TEXT) {
                        obj = next;
                        break;
                    }
                }
                apcy apcyVar = (apcy) obj;
                if (apcyVar == null || (c = apcyVar.d()) == null) {
                    c = appwVar.c();
                }
                incomingDraft2 = new IncomingDraft(aygqVar3, c, null, null, false, null, null, false, 252, null);
            } else {
                incomingDraft = new IncomingDraft(aygq.d, ((appw) appjVar).c(), null, null, false, null, null, false, 252, null);
                incomingDraft2 = incomingDraft;
            }
        } else if (appjVar instanceof apps) {
            incomingDraft2 = new IncomingDraft(aygq.d, ((apps) appjVar).m(), null, null, false, null, null, false, 252, null);
        } else if (appjVar instanceof apqd) {
            aygq aygqVar4 = aygq.d;
            apqd apqdVar = (apqd) appjVar;
            String k = apqdVar.k();
            String b2 = appjVar.b();
            b2.getClass();
            incomingDraft2 = new IncomingDraft(aygqVar4, k, ffdx.b(new IncomingDraft.Attachment(b2, b(apqdVar.e()), null)), null, false, null, null, true, 120, null);
        } else if (appjVar instanceof apmq) {
            aygq aygqVar5 = aygq.d;
            String b3 = appjVar.b();
            b3.getClass();
            incomingDraft2 = new IncomingDraft(aygqVar5, null, ffdx.b(new IncomingDraft.Attachment(b3, b(((apmq) appjVar).e()), null)), null, false, null, null, true, 122, null);
        } else {
            incomingDraft = new IncomingDraft(aygq.d, null, null, null, false, null, null, true, 126, null);
            incomingDraft2 = incomingDraft;
        }
        ahtuVar.b(a, eisxVar, incomingDraft2, equr.FORWARD);
        return ffcu.a;
    }
}
