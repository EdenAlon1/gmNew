package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.view.View;
import android.widget.TextView;
import androidx.core.app.RemoteActionCompat;
import com.android.vcard.VCardConfig;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwlm extends exaj {
    private static final entd b = entd.c("BugleLinkify");
    private final Spannable c;
    private final Context d;
    private final cpdm e;
    private final cfyt f;
    private final Optional g;
    private final ffbr h;

    public cwlm(Spannable spannable, exao exaoVar, Context context, cpdm cpdmVar, cfyt cfytVar, czja czjaVar, ffbr ffbrVar) {
        super(exaoVar);
        this.c = spannable;
        this.d = context;
        this.e = cpdmVar;
        this.f = cfytVar;
        this.g = Optional.ofNullable(czjaVar);
        this.h = ffbrVar;
    }

    private static ActivityOptions d() {
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
        return pendingIntentBackgroundActivityStartMode;
    }

    private final String e(Spannable spannable) {
        exam examVar = this.a.a;
        return spannable.subSequence(examVar.b, examVar.c).toString();
    }

    private final void f(TextView textView, ewyx ewyxVar) {
        if (!((Boolean) ((cfup) cpdm.a.get()).e()).booleanValue()) {
            List list = ewyxVar.b;
            if (!list.isEmpty()) {
                try {
                    ((ensz) ((ensz) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "handleUrlClassification", 138, "TCLibLinkifyTextSpan.java")).q("TCLib: perform first action to open URL in default app.");
                    if (((aubt) this.h.b()).a() && ctid.h) {
                        ((RemoteActionCompat) list.get(0)).d.send(d().toBundle());
                        return;
                    } else {
                        ((RemoteActionCompat) list.get(0)).d.send();
                        return;
                    }
                } catch (PendingIntent.CanceledException unused) {
                    ((ensz) ((ensz) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "handleUrlClassification", 146, "TCLibLinkifyTextSpan.java")).q("Failed to start the PendingIntent in onTextClassificationResult");
                }
            }
        } else if (c(textView.getContext(), ewyxVar)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", a(this.c));
        if (this.e.a()) {
            intent.addFlags(268439552);
        }
        try {
            ((ensz) ((ensz) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "handleUrlClassification", 159, "TCLibLinkifyTextSpan.java")).t("TCLiB: No actions found, opening activity intent: %s", intent);
            eldl.p(textView.getContext(), intent);
        } catch (ActivityNotFoundException e) {
            ((ensz) ((ensz) ((ensz) b.i()).g(e)).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "handleUrlClassification", (char) 163, "TCLibLinkifyTextSpan.java")).q("TCLib: Unable to open linkified text, activity not found.");
            h(textView, ewyxVar);
        }
    }

    private final void g(TextView textView, ewyx ewyxVar) {
        if (ewyxVar.a() <= 0 || !"url".equals(ewyxVar.c())) {
            h(textView, ewyxVar);
            return;
        }
        if (!((Boolean) ((cfup) cpdm.a.get()).e()).booleanValue()) {
            List list = ewyxVar.b;
            if (!list.isEmpty()) {
                ((ensz) ((ensz) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "onTextClassificationResultLegacy", 187, "TCLibLinkifyTextSpan.java")).q("TCLib: legacy, perform first action to open URL in default app.");
                try {
                    if (((aubt) this.h.b()).a() && ctid.h) {
                        ((RemoteActionCompat) list.get(0)).d.send(d().toBundle());
                        return;
                    } else {
                        ((RemoteActionCompat) list.get(0)).d.send();
                        return;
                    }
                } catch (PendingIntent.CanceledException unused) {
                    ((ensz) ((ensz) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "onTextClassificationResultLegacy", 197, "TCLibLinkifyTextSpan.java")).q("Failed to start the PendingIntent in onTextClassificationResult");
                }
            }
        } else if (c(textView.getContext(), ewyxVar)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", a(this.c));
        if (this.e.a()) {
            intent.addFlags(268439552);
        }
        try {
            ((ensz) ((ensz) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "onTextClassificationResultLegacy", 210, "TCLibLinkifyTextSpan.java")).t("TCLiB: No actions found, opening activity intent: %s", intent);
            eldl.p(textView.getContext(), intent);
        } catch (ActivityNotFoundException e) {
            ((ensz) ((ensz) ((ensz) b.i()).g(e)).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "onTextClassificationResultLegacy", (char) 214, "TCLibLinkifyTextSpan.java")).q("TCLib: Unable to open linkified text, activity not found.");
            h(textView, ewyxVar);
        }
    }

    private final void h(TextView textView, ewyx ewyxVar) {
        try {
            ((ensz) ((ensz) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "tryShowBasicActionsToolbar", 263, "TCLibLinkifyTextSpan.java")).q("TCLiB: Opening basic actions toolbar");
            super.b(textView, ewyxVar);
        } catch (Exception e) {
            ((ensz) ((ensz) ((ensz) b.i()).g(e)).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "tryShowBasicActionsToolbar", (char) 266, "TCLibLinkifyTextSpan.java")).q("TCLib: Failed to show the basic actions toolbar");
            this.f.b(e);
        }
    }

    public final Uri a(Spannable spannable) {
        return Uri.parse(cglt.b(e(spannable)));
    }

    @Override // defpackage.exaj
    public final void b(TextView textView, ewyx ewyxVar) {
        if (crnx.j(this.d) && c(textView.getContext(), ewyxVar)) {
            return;
        }
        if (!((Boolean) ((cfup) ahna.a.get()).e()).booleanValue()) {
            g(textView, ewyxVar);
            return;
        }
        if (ewyxVar.a() <= 0) {
            h(textView, ewyxVar);
            return;
        }
        if (ewyxVar.c().equals("url")) {
            f(textView, ewyxVar);
            return;
        }
        if (!ewyxVar.c().equals("tracking_number")) {
            h(textView, ewyxVar);
            return;
        }
        Intent intent = new Intent("android.intent.action.WEB_SEARCH");
        intent.putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, e(this.c));
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        eldl.p(this.d, intent);
    }

    final boolean c(Context context, ewyx ewyxVar) {
        Bundle deepCopy;
        engw g;
        if (!ewyxVar.b.isEmpty()) {
            deepCopy = ewyxVar.c.deepCopy();
            ArrayList parcelableArrayList = deepCopy.getParcelableArrayList("actions-intents");
            if (parcelableArrayList == null) {
                int i = engw.d;
                g = enou.a;
            } else {
                int i2 = engw.d;
                engr engrVar = new engr();
                int size = parcelableArrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    engrVar.h(new Intent((Intent) parcelableArrayList.get(i3)));
                }
                g = engrVar.g();
            }
            Optional findFirst = Collection.EL.stream(g).findFirst();
            if (findFirst.isEmpty()) {
                ((ensz) ((ensz) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "runFirstActionIntent", 237, "TCLibLinkifyTextSpan.java")).q("TCLiB: No action intent found");
                return false;
            }
            if (this.e.a()) {
                ((ensz) ((ensz) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "runFirstActionIntent", 242, "TCLibLinkifyTextSpan.java")).q("TCLiB: adding flags to launch in split screen");
                ((Intent) findFirst.get()).addFlags(268439552);
            }
            ((ensz) ((ensz) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "runFirstActionIntent", 247, "TCLibLinkifyTextSpan.java")).t("TCLib: Starting text classification action: %s", findFirst.get());
            try {
                eldl.p(context, (Intent) findFirst.get());
                return true;
            } catch (ActivityNotFoundException e) {
                ((ensz) ((ensz) ((ensz) b.i()).g(e)).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "runFirstActionIntent", (char) 254, "TCLibLinkifyTextSpan.java")).q("TCLib: Unable to open linkified text, activity not found.");
            }
        }
        return false;
    }

    @Override // defpackage.exaj, android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.g.isPresent()) {
            czja czjaVar = (czja) this.g.get();
            ahno.a(this.a.a);
            final czjc czjcVar = czjaVar.a;
            czjcVar.e.ifPresent(new Consumer() { // from class: czjb
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    czjc czjcVar2 = czjc.this;
                    ((akwp) obj).c(czjcVar2.b.u(), czjcVar2.a.q);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cfva cfvaVar = aoqm.a;
            if (czjcVar.f.j(((Boolean) new aopr().get()).booleanValue() ? czjcVar.b.r().p(((Boolean) new aopr().get()).booleanValue()) : czjcVar.b.S())) {
                altk altkVar = czjcVar.g;
                bcse bcseVar = czjcVar.b;
                altkVar.an(bcseVar.r(), bcseVar.A(), bcseVar.u().b());
            }
        }
        super.onClick(view);
    }
}
