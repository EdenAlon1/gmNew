package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deee {
    private static final entd b = entd.c("BugleConversation");
    public final ffsk a;
    private final Context c;
    private final bdiw d;
    private final ayfg e;
    private final amet f;
    private final alxl g;
    private final aqkp h;
    private final aqvh i;
    private final aolr j;
    private final bbfh k;
    private final ffbr l;

    public deee(Context context, ffsk ffskVar, bdiw bdiwVar, ayfg ayfgVar, amet ametVar, alxl alxlVar, aqkp aqkpVar, aqvh aqvhVar, aolr aolrVar, bbfh bbfhVar, ffbr ffbrVar) {
        context.getClass();
        ffskVar.getClass();
        bdiwVar.getClass();
        ayfgVar.getClass();
        ametVar.getClass();
        alxlVar.getClass();
        aqkpVar.getClass();
        aqvhVar.getClass();
        aolrVar.getClass();
        bbfhVar.getClass();
        ffbrVar.getClass();
        this.c = context;
        this.a = ffskVar;
        this.d = bdiwVar;
        this.e = ayfgVar;
        this.f = ametVar;
        this.g = alxlVar;
        this.h = aqkpVar;
        this.i = aqvhVar;
        this.j = aolrVar;
        this.k = bbfhVar;
        this.l = ffbrVar;
    }

    private final void b(Intent intent, ConversationId conversationId, boolean z, boolean z2, boolean z3, boolean z4) {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        entd entdVar = b;
        ensz enszVar = (ensz) entdVar.h();
        enszVar.Y(csux.q, conversationId);
        enszVar.q("Action Voice Handler using MAPI to process SendMessage Intent.");
        amet.d(conversationId, intent, true);
        intent.setAction("android.intent.action.SENDTO");
        if (z3) {
            try {
                ArrayList arrayList = new ArrayList();
                if (intent.getBooleanExtra("SEND_MULTIPLE", false)) {
                    intent.setAction("android.intent.action.SEND_MULTIPLE");
                    ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT > 33 ? intent.getParcelableArrayListExtra("android.intent.extra.STREAM", Uri.class) : intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                    if (parcelableArrayListExtra == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    arrayList.addAll(parcelableArrayListExtra);
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        parcelableExtra2 = intent.getParcelableExtra("android.intent.extra.STREAM", Uri.class);
                        parcelableExtra = (Parcelable) parcelableExtra2;
                    } else {
                        parcelableExtra = intent.getParcelableExtra("android.intent.extra.STREAM");
                    }
                    Uri uri = (Uri) parcelableExtra;
                    if (uri != null) {
                        arrayList.add(uri);
                    }
                }
                intent.putParcelableArrayListExtra("message_parts", this.d.e(arrayList, intent.getType()));
            } catch (IllegalArgumentException e) {
                ((ensz) ((ensz) b.j()).g(e)).q("Internal error. Failed to extract data from intent.");
                throw new IllegalArgumentException("Internal error. Failed to extract data from intent.", e);
            }
        }
        if (z2) {
            bdiz d = this.d.d(intent, aygq.l);
            if (!d.c() || z4) {
                this.e.D(this.c, conversationId, d, z4, intent.getExtras());
                return;
            } else {
                ((ensz) entdVar.j()).q("Internal error. Failed to parse draft data from intent.");
                throw new IllegalArgumentException("Internal error. Failed to parse draft data from intent.");
            }
        }
        ensz enszVar2 = (ensz) entdVar.h();
        enszVar2.Y(csux.q, conversationId);
        enszVar2.q("Action Voice Handler using MAPI to Sending Message.");
        this.k.b(intent);
        if (z) {
            this.e.D(this.c, conversationId, ((atdn) this.l.b()).a() ? new bdix(null) : new bdja(null), z4, intent.getExtras());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Intent r13, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r14, java.lang.String r15, boolean r16, boolean r17, boolean r18, boolean r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deee.a(android.content.Intent, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, java.lang.String, boolean, boolean, boolean, boolean, ffgu):java.lang.Object");
    }
}
