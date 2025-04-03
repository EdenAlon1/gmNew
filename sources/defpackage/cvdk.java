package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.gms.duokit.GenerateInviteLinkRequest;
import com.google.android.gms.duokit.GenerateInviteLinkResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvdk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvdp b;
    final /* synthetic */ ResolvedRecipient c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvdk(ffgu ffguVar, cvdp cvdpVar, ResolvedRecipient resolvedRecipient) {
        super(2, ffguVar);
        this.b = cvdpVar;
        this.c = resolvedRecipient;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvdk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                GenerateInviteLinkRequest generateInviteLinkRequest = new GenerateInviteLinkRequest();
                generateInviteLinkRequest.a = cvdp.i(this.c);
                generateInviteLinkRequest.b = cvfb.b.d;
                dhre a = this.b.b.a(generateInviteLinkRequest);
                this.a = 1;
                obj = axpj.a(a, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            return ((GenerateInviteLinkResponse) obj).a;
        } catch (Exception e) {
            ensk j = cvdp.a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/shared/video/BugleVideoCalling2$generateDuoInviteLink$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 154, "BugleVideoCalling2.kt")).q("generateDuoInviteLink failed");
            return null;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cvdk cvdkVar = new cvdk(ffguVar, this.b, this.c);
        cvdkVar.d = obj;
        return cvdkVar;
    }
}
