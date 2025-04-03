package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekjl {
    private static final emxg a = new emxg() { // from class: ekjj
        @Override // defpackage.emxg
        public final boolean a(Object obj) {
            return ((Context) obj) instanceof fbas;
        }
    };
    private static final emxg b = new emxg() { // from class: ekjk
        @Override // defpackage.emxg
        public final boolean a(Object obj) {
            return ((Context) obj) instanceof ekkn;
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static ekji a(ea eaVar) {
        return c(((ekhq) eaVar).aZ(), b);
    }

    public static ekji b(ekki ekkiVar) {
        return c(ekkiVar.a, a);
    }

    private static ekji c(Context context, emxg emxgVar) {
        for (Context context2 = context; !emxgVar.a(context2); context2 = ((ContextWrapper) context2).getBaseContext()) {
            if (!(context2 instanceof ContextWrapper)) {
                throw new IllegalStateException("Cannot use base context of type " + String.valueOf(context.getClass()) + " for ViewContext.");
            }
        }
        return new ekji(context);
    }
}
