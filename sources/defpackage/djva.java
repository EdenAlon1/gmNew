package defpackage;

import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djva {
    public static final entd a = entd.c(dktl.a);
    public final dkcp b;
    private final cguo c;

    public djva(dkcp dkcpVar, cguo cguoVar) {
        this.b = dkcpVar;
        this.c = cguoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final cmay a(cmay cmayVar, cmau cmauVar, Optional optional) {
        cmat cmatVar = (cmat) cmav.a.createBuilder();
        cmatVar.copyOnWrite();
        cmav cmavVar = (cmav) cmatVar.instance;
        cmavVar.e = cmauVar.a();
        cmavVar.b |= 4;
        eyja d = eykm.d(dkvj.a().longValue());
        cmatVar.copyOnWrite();
        cmav cmavVar2 = (cmav) cmatVar.instance;
        d.getClass();
        cmavVar2.c = d;
        cmavVar2.b |= 1;
        if (optional.isPresent()) {
            Object obj = optional.get();
            cmatVar.copyOnWrite();
            cmav cmavVar3 = (cmav) cmatVar.instance;
            cmavVar3.d = (eyja) obj;
            cmavVar3.b |= 2;
        }
        eygr eygrVar = cmayVar.d;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < eygrVar.size(); i++) {
            if (i == eygrVar.size() - 1) {
                cmaq cmaqVar = (cmaq) cmax.a.createBuilder((cmax) eygrVar.get(i));
                cmav cmavVar4 = (cmav) cmatVar.build();
                cmaqVar.copyOnWrite();
                cmax cmaxVar = (cmax) cmaqVar.instance;
                cmavVar4.getClass();
                cmaxVar.d = cmavVar4;
                cmaxVar.b |= 2;
                arrayList.add((cmax) cmaqVar.build());
            } else {
                arrayList.add((cmax) eygrVar.get(i));
            }
        }
        cmap createBuilder = cmay.a.createBuilder(cmayVar);
        createBuilder.copyOnWrite();
        ((cmay) createBuilder.instance).d = cmay.emptyProtobufList();
        createBuilder.a(arrayList);
        return createBuilder.build();
    }

    public final Optional b(cmay cmayVar) {
        eygr eygrVar = cmayVar.d;
        return eygrVar.isEmpty() ? Optional.empty() : Optional.of((cmax) enjk.j(eygrVar));
    }

    final void c(String str) {
        cmay b = this.b.b(str);
        Optional b2 = b(b);
        if (b2.isPresent() && (((cmax) b2.get()).b & 2) == 0) {
            this.b.q(str, a(b, cmau.OTP_REQUEST_WITH_ADDITIONAL_QUOTA_COMPLETE, Optional.empty()));
            ((ensz) ((ensz) a.h()).h("com/google/android/ims/provisioning/engine/ForcePhoneNumberVerificationUtil", "handleIfVerificationRequestSuccessful", 120, "ForcePhoneNumberVerificationUtil.java")).q("Force verification request successful. Storing record.");
        }
    }

    public final boolean d(String str) {
        int b;
        Optional b2 = b(this.b.b(str));
        if (b2.isEmpty()) {
            return false;
        }
        boolean z = (((cmax) b2.get()).b & 1) != 0 && (((cmax) b2.get()).b & 2) == 0;
        return (!djai.z() || !djai.ac()) ? dizg.z() : this.c.c(str).y ? z && (b = cmaw.b(((cmax) b2.get()).e)) != 0 && b == 4 : z;
    }
}
