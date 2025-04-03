package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cncq {
    public static final cmrm a(fayv fayvVar) {
        Optional b = clbe.b(fayvVar);
        return !b.isPresent() ? cmrm.REACTION_ACTION_UNSPECIFIED : ffkj.e(b.get(), "+Reaction") ? cmrm.ADD_REACTION : ffkj.e(b.get(), "-Reaction") ? cmrm.REMOVE_REACTION : cmrm.REACTION_ACTION_UNSPECIFIED;
    }
}
