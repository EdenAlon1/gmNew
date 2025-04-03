package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.RebuildShortcutsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import defpackage.autz;
import defpackage.bape;
import defpackage.bapf;
import defpackage.bcqg;
import defpackage.csll;
import defpackage.ctid;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.ensz;
import defpackage.entd;
import defpackage.eogt;
import defpackage.errm;
import defpackage.ffbr;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class RebuildShortcutsAction extends ThrottledAction {
    public final bcqg b;
    public final errm c;
    public final errm d;
    private final Optional f;
    private final ffbr g;
    public static final entd a = entd.c("BugleShortcuts");
    private static final long e = TimeUnit.SECONDS.toMillis(60);
    public static final Parcelable.Creator<ThrottledAction> CREATOR = new bape();

    /* compiled from: PG */
    public interface a {
        /* renamed from: if */
        bapf mo163if();
    }

    public RebuildShortcutsAction(Context context, Optional<csll> optional, bcqg bcqgVar, errm errmVar, ffbr<autz> ffbrVar, errm errmVar2) {
        super(eogt.REBUILD_SHORTCUTS_ACTION);
        this.f = optional;
        this.b = bcqgVar;
        this.c = errmVar;
        this.g = ffbrVar;
        this.d = errmVar2;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("RebuildShortcutsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RebuildShortCuts.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 107;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return e;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "RebuildShortcutsAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void i() {
        if (((autz) this.g.b()).a() && ctid.d) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/datamodel/action/RebuildShortcutsAction", "doThrottledWork", 111, "RebuildShortcutsAction.java")).q("Device is R+, not rebuilding shortcuts");
        } else {
            this.f.ifPresent(new Consumer() { // from class: bapc
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    elfl l = ((csll) obj).l();
                    final RebuildShortcutsAction rebuildShortcutsAction = RebuildShortcutsAction.this;
                    elfr.l(l.h(new emwl() { // from class: bapb
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            RebuildShortcutsAction.this.b.a();
                            return null;
                        }
                    }, rebuildShortcutsAction.d), new bapd(), rebuildShortcutsAction.c);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public RebuildShortcutsAction(Context context, Optional<csll> optional, bcqg bcqgVar, errm errmVar, ffbr<autz> ffbrVar, errm errmVar2, Parcel parcel) {
        super(parcel, eogt.REBUILD_SHORTCUTS_ACTION);
        this.f = optional;
        this.b = bcqgVar;
        this.c = errmVar;
        this.d = errmVar2;
        this.g = ffbrVar;
    }
}
