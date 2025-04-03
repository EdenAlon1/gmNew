package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters;
import java.lang.reflect.Field;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbdv {
    public static final cskc a = cskc.g("BugleAction", "ActionSerializer");
    public final ffbr b;
    private final ffbr c;

    public bbdv(ffbr ffbrVar, ffbr ffbrVar2) {
        this.c = ffbrVar;
        this.b = ffbrVar2;
    }

    public static String e(bbcg bbcgVar) {
        return bbej.b(bbcgVar.i());
    }

    private static Action f(String str, Parcel parcel) {
        try {
            Field field = Class.forName(str).getField("CREATOR");
            if (!(field.get(null) instanceof Parcelable.Creator)) {
                throw new NoSuchFieldException(a.a(str, "CREATOR of ", " isn't a Parcelable.Creator<? extends Action>"));
            }
            Parcelable.Creator creator = (Parcelable.Creator) field.get(null);
            if (creator != null) {
                return (Action) creator.createFromParcel(parcel);
            }
            throw new NoSuchFieldException(a.t(str, "Failed to get CREATOR method of "));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            csjb e2 = a.e();
            e2.I("Upgrade Exception when unparceling");
            e2.I(str);
            e2.A("Parcel", bbej.c(parcel));
            e2.s(e);
            return null;
        }
    }

    public final Bundle a(Action action) {
        Bundle bundle = new Bundle();
        bundle.putString("bundle_action_name", action.getClass().getName());
        bundle.putString("bundle_action_key", action.s);
        bundle.putParcelable("bundle_action_params", action.t.i());
        return bundle;
    }

    public final Action b(String str, String str2, ActionParameters actionParameters) {
        Action action = null;
        if (TextUtils.isEmpty(str)) {
            a.r("No className found when unparceling action. Must be parceled via old way.");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            csjb e = a.e();
            e.I("No key found when unparceling");
            e.I(str);
            e.I(". Must be parceled via old way.");
            e.r();
            return null;
        }
        if (actionParameters == null) {
            csjb e2 = a.e();
            e2.I("No Params found when unparceling");
            e2.I(str);
            e2.I(". Must be parceled via old way.");
            e2.r();
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.writeString(str2);
                obtain.writeParcelable(actionParameters, 0);
                obtain.setDataPosition(0);
                try {
                    ffbr ffbrVar = (ffbr) ((Map) ((fbbb) this.c).a).get(Class.forName(str));
                    if (ffbrVar == null) {
                        csjb d = a.d();
                        d.I("No className found when unparceling");
                        d.I(str);
                        d.v(". Must be parceled via old way.");
                        d.r();
                    } else {
                        action = ((bbck) ffbrVar.b()).c(obtain);
                    }
                } catch (ClassNotFoundException e3) {
                    csjb d2 = a.d();
                    d2.I("No className found when unparceling");
                    d2.I(str);
                    d2.v(". Must be parceled via old way.");
                    d2.s(e3);
                }
                if (action != null) {
                    return action;
                }
                Action f = f(str, obtain);
                csix.l(f);
                return f;
            } catch (RuntimeException e4) {
                e4.addSuppressed(new RuntimeException(a.m(bbej.c(obtain), str, "Unexpected Exception when unparceling ", " with parcel ")));
                throw e4;
            }
        } finally {
            obtain.recycle();
        }
    }

    public final Action c(Bundle bundle) {
        Action b = b(bundle.getString("bundle_action_name"), bundle.getString("bundle_action_key"), (ActionParameters) bundle.getParcelable("bundle_action_params"));
        return b != null ? b : (Action) bundle.getParcelable("bundle_action");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.apps.messaging.shared.datamodel.action.common.Action d(android.os.PersistableBundle r7) {
        /*
            r6 = this;
            java.lang.String r0 = "bundle_action_name"
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = "bundle_action_key"
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r2 = "bundle_action_serialized_params"
            java.lang.String r2 = r7.getString(r2)
            r3 = 0
            if (r0 != 0) goto L1e
            cskc r0 = defpackage.bbdv.a
            java.lang.String r1 = "No className found when unparceling action. Must be parceled via old way."
            r0.r(r1)
        L1c:
            r0 = r3
            goto L84
        L1e:
            if (r1 != 0) goto L28
            cskc r0 = defpackage.bbdv.a
            java.lang.String r1 = "No key found when unparceling action. Must be parceled via old way."
            r0.r(r1)
            goto L1c
        L28:
            ffbr r4 = r6.b
            java.lang.Object r4 = r4.b()
            arej r4 = (defpackage.arej) r4
            boolean r4 = r4.a()
            if (r4 == 0) goto L6b
            java.lang.String r4 = "persistable_bundle_action_params"
            android.os.PersistableBundle r4 = r7.getPersistableBundle(r4)
            j$.util.Optional r4 = j$.util.Optional.ofNullable(r4)
            bbdp r5 = new bbdp
            r5.<init>()
            j$.util.Optional r4 = r4.map(r5)
            bbdq r5 = new bbdq
            r5.<init>()
            j$.util.Optional r4 = r4.map(r5)
            bbdr r5 = new bbdr
            r5.<init>()
            j$.util.Optional r2 = r4.or(r5)
            bbds r4 = new bbds
            r4.<init>()
            j$.util.Optional r0 = r2.map(r4)
            java.lang.Object r0 = r0.orElse(r3)
            com.google.android.apps.messaging.shared.datamodel.action.common.Action r0 = (com.google.android.apps.messaging.shared.datamodel.action.common.Action) r0
            goto L84
        L6b:
            if (r2 != 0) goto L75
            cskc r0 = defpackage.bbdv.a
            java.lang.String r1 = "No byteString found when unparceling action. Must be parceled via old way."
            r0.r(r1)
            goto L1c
        L75:
            java.lang.Class<com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters> r4 = com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters.class
            java.lang.Object r2 = defpackage.bbej.a(r2, r4, r0)
            com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters r2 = (com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters) r2
            if (r2 != 0) goto L80
            goto L1c
        L80:
            com.google.android.apps.messaging.shared.datamodel.action.common.Action r0 = r6.b(r0, r1, r2)
        L84:
            if (r0 != 0) goto La1
            java.lang.String r0 = "action_parcel"
            java.lang.String r7 = r7.getString(r0)
            if (r7 != 0) goto L96
            cskc r7 = defpackage.bbdv.a
            java.lang.String r0 = "No bytes found when unparceling action the old way"
            r7.r(r0)
            return r3
        L96:
            java.lang.Class<com.google.android.apps.messaging.shared.datamodel.action.common.Action> r0 = com.google.android.apps.messaging.shared.datamodel.action.common.Action.class
            java.lang.String r1 = "Action"
            java.lang.Object r7 = defpackage.bbej.a(r7, r0, r1)
            com.google.android.apps.messaging.shared.datamodel.action.common.Action r7 = (com.google.android.apps.messaging.shared.datamodel.action.common.Action) r7
            return r7
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbdv.d(android.os.PersistableBundle):com.google.android.apps.messaging.shared.datamodel.action.common.Action");
    }
}
