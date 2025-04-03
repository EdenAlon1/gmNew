package defpackage;

import com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xyx implements xyg {
    private final xyv a;
    private final xyr b;
    private final xyw c;

    public xyx(xyv xyvVar, xyr xyrVar, xyw xywVar) {
        this.a = xyvVar;
        this.b = xyrVar;
        this.c = xywVar;
    }

    @Override // defpackage.xyg
    public final Object a(xho xhoVar, xyj xyjVar, String str, ffgu ffguVar) {
        xyg xygVar;
        doxs doxsVar = xhoVar.a;
        if (doxsVar instanceof drlj) {
            xygVar = this.a;
        } else if (doxsVar instanceof doyd) {
            xygVar = this.b;
        } else {
            if (!(doxsVar instanceof RichLocation)) {
                Objects.toString(doxsVar);
                throw new UnsupportedOperationException("Unsupported media: ".concat(doxsVar.toString()));
            }
            xygVar = this.c;
        }
        return xygVar.a(xhoVar, xyjVar, str, ffguVar);
    }
}
