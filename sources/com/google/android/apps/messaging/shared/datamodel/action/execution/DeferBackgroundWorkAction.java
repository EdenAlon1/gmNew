package com.google.android.apps.messaging.shared.datamodel.action.execution;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.execution.DeferBackgroundWorkAction;
import defpackage.bbdv;
import defpackage.bbee;
import defpackage.bbef;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class DeferBackgroundWorkAction extends Action<Void> {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bbee();
    public final bbdv a;

    /* compiled from: PG */
    public interface a {
        bbef hD();
    }

    public DeferBackgroundWorkAction(bbdv bbdvVar, Parcel parcel) {
        super(parcel, eogt.DEFER_BACKGROUND_WORK_ACTION);
        this.a = bbdvVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("DeferBackgroundWorkAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        if (this.t.x("bundled_background_actions")) {
            ArrayList n = this.t.n("bundled_background_actions", Bundle.class);
            n.getClass();
            Collection.EL.stream(n).map(new Function() { // from class: bbea
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Action c = DeferBackgroundWorkAction.this.a.c((Bundle) obj);
                    c.getClass();
                    return c;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).forEach(new Consumer() { // from class: bbeb
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    DeferBackgroundWorkAction.this.u.add((Action) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return null;
        }
        ArrayList n2 = this.t.n("background_actions", Action.class);
        n2.getClass();
        Collection.EL.stream(n2).forEach(new Consumer() { // from class: bbeb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                DeferBackgroundWorkAction.this.u.add((Action) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public DeferBackgroundWorkAction(final bbdv bbdvVar, ArrayList arrayList) {
        super(eogt.DEFER_BACKGROUND_WORK_ACTION);
        this.a = bbdvVar;
        this.t.u("bundled_background_actions", (ArrayList) Collection.EL.stream(arrayList).map(new Function() { // from class: bbec
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return bbdv.this.a((Action) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: bbed
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        })));
    }
}
