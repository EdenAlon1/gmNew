package defpackage;

import com.google.android.apps.messaging.multishare.chip.ChipData;
import com.google.android.apps.messaging.multishare.chip.ChipId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aiby extends ffkh implements ffix {
    public aiby(Object obj) {
        super(0, obj, aica.class, "onClick", "onClick()V", 0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        aica aicaVar = (aica) this.g;
        ekzm b = aicaVar.d.b("MultiShare MirrorExtendedFabAdapterImpl#onClick");
        try {
            int size = aicaVar.f.a().c().size();
            if (size == 1) {
                ((aifv) aicaVar.i.b()).b(1);
                ChipData chipData = (ChipData) aicaVar.f.a().c().get(0);
                ChipId chipId = chipData.a;
                if (chipId instanceof ChipId.Identity) {
                    axol.k(aicaVar.a, aicaVar.b, new aibx(aicaVar, ((ChipId.Identity) chipId).a, chipData.b, null), 2);
                } else {
                    if (!(chipId instanceof ChipId.Conversation)) {
                        throw new ffcd();
                    }
                    aicaVar.b(((ChipId.Conversation) chipId).a);
                }
            } else {
                ((aifv) aicaVar.i.b()).b(size);
                aicaVar.h.b();
            }
            ffig.a(b, null);
            return ffcu.a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(b, th);
                throw th2;
            }
        }
    }
}
