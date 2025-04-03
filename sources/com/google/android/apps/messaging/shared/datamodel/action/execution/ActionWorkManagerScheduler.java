package com.google.android.apps.messaging.shared.datamodel.action.execution;

import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import defpackage.arej;
import defpackage.bbbz;
import defpackage.bbci;
import defpackage.bbcj;
import defpackage.bbdq;
import defpackage.bbdv;
import defpackage.bbej;
import defpackage.csix;
import defpackage.cskc;
import defpackage.ekhw;
import defpackage.elbx;
import defpackage.eleg;
import defpackage.erqt;
import defpackage.ffbr;
import defpackage.pot;
import defpackage.ppn;
import defpackage.ppr;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ActionWorkManagerScheduler {
    public static final cskc a = cskc.g("BugleDataModel", "ActionWorkManagerScheduler");
    public final ffbr b;
    public final Context c;

    /* compiled from: PG */
    public static class ActionWorker extends ppr {
        private final bbdv e;
        private final bbbz f;
        private final elbx g;

        public ActionWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            a aVar = (a) ekhw.a(context, a.class);
            this.e = aVar.aO();
            this.f = aVar.aN();
            this.g = aVar.b();
        }

        @Override // defpackage.ppr
        public final ListenableFuture b() {
            AutoCloseable f;
            Action b;
            ListenableFuture i;
            try {
                f = this.g.b("ActionWorker#startWork");
            } catch (IllegalStateException unused) {
                eleg.d();
                f = eleg.f("ActionWorker#startWork");
            }
            AutoCloseable autoCloseable = f;
            try {
                final bbdv bbdvVar = this.e;
                final pot f2 = f();
                final String d = f2.d("bundle_action_name");
                final String d2 = f2.d("bundle_action_key");
                if (((arej) bbdvVar.b.b()).a()) {
                    b = (Action) Optional.ofNullable(f2.g("persistable_bundle_action_params_serialized")).flatMap(new Function() { // from class: bbdt
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            PersistableBundle readFromStream;
                            byte[] bArr = (byte[]) obj;
                            if (!ctid.d) {
                                return Optional.empty();
                            }
                            try {
                                readFromStream = PersistableBundle.readFromStream(eyee.x(bArr).m());
                                return Optional.of(readFromStream);
                            } catch (IOException e) {
                                csjb e2 = bbdv.a.e();
                                e2.I("IOException deserializing PersistableBundle");
                                e2.s(e);
                                return Optional.empty();
                            }
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).map(new bbdq()).or(new Supplier() { // from class: bbdu
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            pot potVar = pot.this;
                            return Optional.ofNullable((ActionParameters) bbej.a((String) Optional.ofNullable(potVar.d("bundle_action_params")).orElse(potVar.d("bundle_action_serialized_params")), ActionParameters.class, "ActionParameters"));
                        }
                    }).map(new Function() { // from class: bbdl
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return bbdv.this.b(d, d2, ((bbcg) obj).i());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse(null);
                } else {
                    String d3 = f2.d("bundle_action_params");
                    if (d3 == null) {
                        d3 = f2.d("bundle_action_serialized_params");
                    }
                    b = bbdvVar.b(d, d2, (ActionParameters) bbej.a(d3, ActionParameters.class, "ActionParameters"));
                }
                if (b == null) {
                    csix.c("failed to unparcel scheduled Action");
                    i = erqt.i(new ppn());
                } else {
                    final SettableFuture create = SettableFuture.create();
                    bbcj bbcjVar = new bbcj(b.s, bbcj.a(b), new bbci() { // from class: bbdw
                        @Override // defpackage.bbci
                        public final void a() {
                            SettableFuture.this.set(new ppp());
                        }
                    }, null, true);
                    bbcjVar.b = toString();
                    try {
                        this.f.a(bbcjVar, b);
                        i = create;
                    } catch (RuntimeException e) {
                        ActionWorkManagerScheduler.a.o("RuntimeException when starting job.", e);
                        i = erqt.i(new ppn());
                    }
                }
                autoCloseable.close();
                return i;
            } finally {
            }
        }
    }

    /* compiled from: PG */
    public interface a {
        bbbz aN();

        bbdv aO();

        elbx b();
    }

    public ActionWorkManagerScheduler(ffbr ffbrVar, Context context) {
        this.b = ffbrVar;
        this.c = context;
    }
}
