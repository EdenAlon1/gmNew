package com.google.android.apps.messaging.wearable;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.akvg;
import defpackage.altk;
import defpackage.ayfg;
import defpackage.bdgq;
import defpackage.csux;
import defpackage.ctvs;
import defpackage.cwml;
import defpackage.deeh;
import defpackage.enjk;
import defpackage.ensk;
import defpackage.ensz;
import defpackage.entd;
import defpackage.fazb;
import defpackage.ffbr;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WearableSetDefaultSmsAppActivity extends deeh {
    private static final entd s = entd.c("BugleWearable");
    public fazb n;
    public ffbr o;
    public ffbr p;
    public ffbr q;
    public ffbr r;

    @Override // defpackage.cwps
    public final cwml eY() {
        return cwml.a;
    }

    @Override // defpackage.efac, defpackage.eg, defpackage.abe, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            ((altk) this.n.b()).v(false, true);
        }
        finish();
    }

    @Override // defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Optional empty;
        super.onCreate(bundle);
        entd entdVar = s;
        ensz enszVar = (ensz) entdVar.h();
        enszVar.Y(csux.O, "WearableSetDefaultSmsAppActivity");
        ((ensz) enszVar.h("com/google/android/apps/messaging/wearable/WearableSetDefaultSmsAppActivity", "onCreate", 57, "WearableSetDefaultSmsAppActivity.java")).q("Processing remote intents");
        Intent intent = getIntent();
        if (!((ctvs) this.r.b()).d()) {
            Uri build = new Uri.Builder().scheme("wear").path("/bugle/set_default_sms/").build();
            if ("android.intent.action.VIEW".equals(intent.getAction()) && build.equals(intent.getData())) {
                ensk n = entdVar.n();
                n.Y(csux.O, "WearableSetDefaultSmsAppActivity");
                ((ensz) n.h("com/google/android/apps/messaging/wearable/WearableSetDefaultSmsAppActivity", "onCreateV2", 74, "WearableSetDefaultSmsAppActivity.java")).q("Default sms app intent");
                startActivityForResult(((akvg) this.o.b()).l(this), 1);
                return;
            }
        }
        if ("android.intent.action.VIEW".equals(intent.getAction()) && "wear".equals(intent.getScheme()) && intent.getCategories().contains("android.intent.category.BROWSABLE")) {
            Uri data = intent.getData();
            if (data == null) {
                ensz enszVar2 = (ensz) entdVar.j();
                enszVar2.Y(csux.O, "WearableSetDefaultSmsAppActivity");
                ((ensz) enszVar2.h("com/google/android/apps/messaging/wearable/WearableSetDefaultSmsAppActivity", "extractConversationId", 109, "WearableSetDefaultSmsAppActivity.java")).q("Uri cannot be null");
                empty = Optional.empty();
            } else {
                String path = data.getPath();
                if (path == null || !path.startsWith("/bugle/rpc/open_conversation/")) {
                    ensk n2 = entdVar.n();
                    n2.Y(csux.O, "WearableSetDefaultSmsAppActivity");
                    ((ensz) n2.h("com/google/android/apps/messaging/wearable/WearableSetDefaultSmsAppActivity", "extractConversationId", 117, "WearableSetDefaultSmsAppActivity.java")).t("Unsupported intent path: %s", data.getPath());
                    empty = Optional.empty();
                } else {
                    empty = Optional.of(bdgq.b((String) enjk.j(data.getPathSegments())));
                }
            }
        } else {
            ensz enszVar3 = (ensz) entdVar.j();
            enszVar3.Y(csux.O, "WearableSetDefaultSmsAppActivity");
            ((ensz) enszVar3.h("com/google/android/apps/messaging/wearable/WearableSetDefaultSmsAppActivity", "extractConversationId", 102, "WearableSetDefaultSmsAppActivity.java")).q("Intent.action is not ACTION_VIEW or Intent.scheme is not WEAR_URI_SCHEME or invalid category");
            empty = Optional.empty();
        }
        if (empty.isPresent()) {
            ensk n3 = entdVar.n();
            n3.Y(csux.O, "WearableSetDefaultSmsAppActivity");
            ((ensz) n3.h("com/google/android/apps/messaging/wearable/WearableSetDefaultSmsAppActivity", "onCreateV2", 83, "WearableSetDefaultSmsAppActivity.java")).q("Open on phone intent.");
            ((ayfg) this.p.b()).A((Context) this.q.b(), new BugleConversationId((ConversationIdType) empty.get()));
        }
        finish();
    }
}
