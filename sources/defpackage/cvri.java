package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.startchat.viewmodel.StartChatViewModel;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvri {
    public final fazb a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbz k;
    public final ffbz l;
    private final ffbr m;
    private final ffbz n;

    public cvri(fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10) {
        fazbVar.getClass();
        ffbrVar8.getClass();
        ffbrVar10.getClass();
        this.a = fazbVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.m = ffbrVar5;
        this.f = ffbrVar6;
        this.g = ffbrVar7;
        this.h = ffbrVar8;
        this.i = ffbrVar9;
        this.j = ffbrVar10;
        Object b = ffbrVar.b();
        b.getClass();
        ea eaVar = (ea) b;
        ffbz b2 = ffca.b(3, new cvre(new cvrd(eaVar)));
        int i = fflc.a;
        this.n = new lmn(new ffkb(StartChatViewModel.class), new cvrf(b2), new cvrh(eaVar, b2), new cvrg(b2));
        this.k = ffca.a(new ffix() { // from class: cvqw
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ffix
            public final Object invoke() {
                eg fe = ((cvqu) cvri.this.b.b()).fe();
                boolean z = false;
                if (!fe.isDestroyed()) {
                    ekhu ekhuVar = fe instanceof ekhu ? (ekhu) fe : null;
                    if ((ekhuVar != null ? ekhuVar.H() : null) instanceof ahra) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
        this.l = ffca.a(new ffix() { // from class: cvqx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ffix
            public final Object invoke() {
                eg fe = ((cvqu) cvri.this.b.b()).fe();
                boolean z = false;
                if (!fe.isDestroyed()) {
                    ekhu ekhuVar = fe instanceof ekhu ? (ekhu) fe : null;
                    if ((ekhuVar != null ? ekhuVar.H() : null) instanceof ajjm) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final SelfIdentityId a() {
        Object parcelable;
        if (((atmy) this.j.b()).a()) {
            Bundle bundle = ((cvqu) this.b.b()).m;
            if (bundle != null) {
                return (SelfIdentityId) ih.a(bundle, "self_identity_id", SelfIdentityId.class);
            }
            return null;
        }
        if (!ctid.f) {
            Bundle bundle2 = ((cvqu) this.b.b()).m;
            if (bundle2 != null) {
                return (SelfIdentityId) bundle2.getParcelable("self_identity_id");
            }
            return null;
        }
        Bundle bundle3 = ((cvqu) this.b.b()).m;
        if (bundle3 == null) {
            return null;
        }
        parcelable = bundle3.getParcelable("self_identity_id", SelfIdentityId.class);
        return (SelfIdentityId) parcelable;
    }

    public final StartChatViewModel b() {
        return (StartChatViewModel) this.n.a();
    }

    public final boolean c() {
        Bundle bundle = ((cvqu) this.b.b()).m;
        if (bundle != null) {
            return cwja.a(bundle.getInt("selection_mode")).b();
        }
        return false;
    }

    public final boolean d() {
        return ((Optional) this.i.b()).isPresent() ? ((akey) ((Optional) this.i.b()).get()).a() == akex.b : ahpj.a(((cvqu) this.b.b()).fe(), ((tam) this.m.b()).a);
    }
}
