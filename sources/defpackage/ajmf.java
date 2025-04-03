package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajmf extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ ajmw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajmf(ajmw ajmwVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.d = ajmwVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ajmf ajmfVar = new ajmf(this.d, (ffgu) obj3);
        ajmfVar.b = (alxg) obj;
        ajmfVar.c = (ResolvedRecipient) obj2;
        return ajmfVar.b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15, types: [alxg, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r11 = this.b;
            Object obj2 = this.c;
            if (obj2 == null) {
                ensk h = ajmw.a.h();
                h.Y(ente.a, "BugleProfiles");
                ((enrr) h.h("com/google/android/apps/messaging/profile/sendingas/SendingAsUiAdapterImpl$getSendingAsUiData$2", "invokeSuspend", 120, "SendingAsUiAdapterImpl.kt")).q("Not showing sending as, need eligible recipient to share to for first time");
                return null;
            }
            ensk h2 = ajmw.a.h();
            h2.Y(ente.a, "BugleProfiles");
            ((enrr) h2.h("com/google/android/apps/messaging/profile/sendingas/SendingAsUiAdapterImpl$getSendingAsUiData$2", "invokeSuspend", 124, "SendingAsUiAdapterImpl.kt")).q("Checking profile sharing constraints");
            ajmw ajmwVar = this.d;
            engw r = engw.r(obj2);
            r.getClass();
            ajmw ajmwVar2 = this.d;
            this.b = null;
            this.a = 1;
            obj = ajmwVar.g.a(r11, r, ajmwVar2.l, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        cjwk cjwkVar = (cjwk) obj;
        if (cjwkVar.a != cjwj.b) {
            ensk h3 = ajmw.a.h();
            h3.Y(ente.a, "BugleProfiles");
            ((enrr) h3.h("com/google/android/apps/messaging/profile/sendingas/SendingAsUiAdapterImpl$getSendingAsUiData$2", "invokeSuspend", 134, "SendingAsUiAdapterImpl.kt")).t("Not showing sending as, unable to share profile: %s", cjwkVar.a);
            return null;
        }
        cjwl cjwlVar = cjwkVar.b;
        if (cjwlVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        aqvi aqviVar = cjwlVar.f;
        if (!aqviVar.b().isPresent() && !aqviVar.c().isPresent()) {
            ensk h4 = ajmw.a.h();
            h4.Y(ente.a, "BugleProfiles");
            ((enrr) h4.h("com/google/android/apps/messaging/profile/sendingas/SendingAsUiAdapterImpl$getSendingAsUiData$2", "invokeSuspend", 143, "SendingAsUiAdapterImpl.kt")).q("Not showing sending as, self profile missing photo or name");
            return null;
        }
        if (((aull) this.d.k.b()).a()) {
            ensk h5 = ajmw.a.h();
            h5.Y(ente.a, "BugleProfiles");
            ((enrr) h5.h("com/google/android/apps/messaging/profile/sendingas/SendingAsUiAdapterImpl$getSendingAsUiData$2", "invokeSuspend", 148, "SendingAsUiAdapterImpl.kt")).q("Ready to show sending as");
        } else {
            ensk h6 = ajmw.a.h();
            h6.Y(ente.a, "BugleProfiles");
            ((enrr) h6.h("com/google/android/apps/messaging/profile/sendingas/SendingAsUiAdapterImpl$getSendingAsUiData$2", "invokeSuspend", 150, "SendingAsUiAdapterImpl.kt")).q("Showing sending as UI...");
        }
        String str = (String) aqviVar.b().get();
        ajmw ajmwVar3 = this.d;
        return new ajmx(str, ajmwVar3.h.a((Uri) aqviVar.c().get(), true));
    }
}
