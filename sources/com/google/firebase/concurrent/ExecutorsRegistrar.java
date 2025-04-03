package com.google.firebase.concurrent;

import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import defpackage.eunf;
import defpackage.eung;
import defpackage.eunh;
import defpackage.euni;
import defpackage.eupl;
import defpackage.eupm;
import defpackage.eupr;
import defpackage.euqj;
import defpackage.euqq;
import defpackage.eurh;
import defpackage.euug;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final euqj a = new euqj(new euug() { // from class: eurl
        @Override // defpackage.euug
        public final Object a() {
            StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
            detectNetwork.detectResourceMismatches();
            detectNetwork.detectUnbufferedIo();
            return ExecutorsRegistrar.a(Executors.newFixedThreadPool(4, new euqu("Firebase Background", 10, detectNetwork.penaltyLog().build())));
        }
    });
    public static final euqj b = new euqj(new euug() { // from class: eurm
        @Override // defpackage.euug
        public final Object a() {
            return ExecutorsRegistrar.a(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new euqu("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())));
        }
    });
    public static final euqj c = new euqj(new euug() { // from class: eurn
        @Override // defpackage.euug
        public final Object a() {
            return ExecutorsRegistrar.a(Executors.newCachedThreadPool(new euqu("Firebase Blocking", 11, null)));
        }
    });
    static final euqj d = new euqj(new euug() { // from class: euro
        @Override // defpackage.euug
        public final Object a() {
            return Executors.newSingleThreadScheduledExecutor(new euqu("Firebase Scheduler", 0, null));
        }
    });

    public static ScheduledExecutorService a(ExecutorService executorService) {
        return new eurh(executorService, (ScheduledExecutorService) d.a());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<eupm<?>> getComponents() {
        eupl euplVar = new eupl(new euqq(eunf.class, ScheduledExecutorService.class), new euqq(eunf.class, ExecutorService.class), new euqq(eunf.class, Executor.class));
        euplVar.c = new eupr() { // from class: eurp
            @Override // defpackage.eupr
            public final Object a(eupo eupoVar) {
                return (ScheduledExecutorService) ExecutorsRegistrar.a.a();
            }
        };
        eupl euplVar2 = new eupl(new euqq(eung.class, ScheduledExecutorService.class), new euqq(eung.class, ExecutorService.class), new euqq(eung.class, Executor.class));
        euplVar2.c = new eupr() { // from class: eurq
            @Override // defpackage.eupr
            public final Object a(eupo eupoVar) {
                return (ScheduledExecutorService) ExecutorsRegistrar.c.a();
            }
        };
        eupl euplVar3 = new eupl(new euqq(eunh.class, ScheduledExecutorService.class), new euqq(eunh.class, ExecutorService.class), new euqq(eunh.class, Executor.class));
        euplVar3.c = new eupr() { // from class: eurr
            @Override // defpackage.eupr
            public final Object a(eupo eupoVar) {
                return (ScheduledExecutorService) ExecutorsRegistrar.b.a();
            }
        };
        eupl a2 = eupm.a(new euqq(euni.class, Executor.class));
        a2.c = new eupr() { // from class: eurs
            @Override // defpackage.eupr
            public final Object a(eupo eupoVar) {
                return eurt.a;
            }
        };
        return Arrays.asList(euplVar.a(), euplVar2.a(), euplVar3.a(), a2.a());
    }
}
