package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.inappreach.internal.IInAppReachService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgsc {
    public static final dgsb a = new dgsb();
    public static final dgse b = new dgse(new dgsd() { // from class: dgrp
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.dgsd
        public final void a(Object obj, Object obj2) {
            ((dgqs) obj).a(obj2);
        }
    });

    public static void a(final dgqu dgquVar, dgsh dgshVar) {
        dfun dfunVar = new dfun();
        dfunVar.b = new Feature[]{dgqa.b};
        dfunVar.a = new dfuf() { // from class: dgrs
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                dgsf dgsfVar = (dgsf) obj;
                dgsb dgsbVar = dgsc.a;
                dgsa dgsaVar = new dgsa((dhri) obj2);
                Context context = dgsfVar.c;
                ((IInAppReachService) dgsfVar.w()).fetchAccountMessages(dgsaVar, dgqu.this.toByteArray(), new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
            }
        };
        dfunVar.c = 28010;
        dgshVar.i(dfunVar.a());
    }
}
