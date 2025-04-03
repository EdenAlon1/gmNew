package defpackage;

import com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xyw implements xyg {
    @Override // defpackage.xyg
    public final Object a(xho xhoVar, xyj xyjVar, String str, ffgu ffguVar) {
        doxs doxsVar = xhoVar.a;
        if (!(doxsVar instanceof RichLocation)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        RichLocation richLocation = (RichLocation) doxsVar;
        if (ffkj.e(richLocation.d.a(), "application/vnd.gsma.rcspushlocation+xml")) {
            return new xzc(new xzl(richLocation.e, richLocation.a, richLocation.b, richLocation.c), null);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
