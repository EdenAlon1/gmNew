package com.google.android.libraries.compose.tenor.rest;

import com.google.android.libraries.compose.tenor.rest.CoroutineCallAdapterFactory;
import defpackage.ffcu;
import defpackage.ffji;
import defpackage.ffkd;
import defpackage.ffkj;
import defpackage.ffrp;
import defpackage.ffrq;
import defpackage.ffss;
import defpackage.fjbj;
import defpackage.fjbk;
import defpackage.fjbl;
import defpackage.fjbm;
import defpackage.fjcb;
import defpackage.fjdu;
import defpackage.fjdx;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class CoroutineCallAdapterFactory extends fjbk {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PG */
    static final class BodyCallAdapter<T> implements fjbl<T, ffss<? extends T>> {
        private final Type responseType;

        public BodyCallAdapter(Type type) {
            type.getClass();
            this.responseType = type;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ffcu adapt$lambda$0(ffrp ffrpVar, fjbj fjbjVar, Throwable th) {
            if (ffrpVar.x()) {
                fjbjVar.c();
            }
            return ffcu.a;
        }

        @Override // defpackage.fjbl
        public Type responseType() {
            return this.responseType;
        }

        @Override // defpackage.fjbl
        public ffss<T> adapt(final fjbj<T> fjbjVar) {
            fjbjVar.getClass();
            final ffrq ffrqVar = new ffrq();
            ffrqVar.hZ(new ffji() { // from class: com.google.android.libraries.compose.tenor.rest.CoroutineCallAdapterFactory$BodyCallAdapter$$ExternalSyntheticLambda0
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ffcu adapt$lambda$0;
                    adapt$lambda$0 = CoroutineCallAdapterFactory.BodyCallAdapter.adapt$lambda$0(ffrp.this, fjbjVar, (Throwable) obj);
                    return adapt$lambda$0;
                }
            });
            fjbjVar.d(new fjbm<T>() { // from class: com.google.android.libraries.compose.tenor.rest.CoroutineCallAdapterFactory$BodyCallAdapter$adapt$2
                @Override // defpackage.fjbm
                public void onFailure(fjbj<T> fjbjVar2, Throwable th) {
                    fjbjVar2.getClass();
                    th.getClass();
                    ffrqVar.a(th);
                }

                @Override // defpackage.fjbm
                public void onResponse(fjbj<T> fjbjVar2, fjdu<T> fjduVar) {
                    fjbjVar2.getClass();
                    fjduVar.getClass();
                    if (!fjduVar.c()) {
                        ffrqVar.a(new fjcb(fjduVar));
                        return;
                    }
                    ffrp<T> ffrpVar = ffrqVar;
                    Object obj = fjduVar.b;
                    obj.getClass();
                    ffrpVar.b(obj);
                }
            });
            return ffrqVar;
        }
    }

    /* compiled from: PG */
    public static final class Companion {
        private Companion() {
        }

        public final CoroutineCallAdapterFactory create() {
            return new CoroutineCallAdapterFactory(null);
        }

        public /* synthetic */ Companion(ffkd ffkdVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PG */
    static final class ResponseCallAdapter<T> implements fjbl<T, ffss<? extends fjdu<T>>> {
        private final Type responseType;

        public ResponseCallAdapter(Type type) {
            type.getClass();
            this.responseType = type;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ffcu adapt$lambda$0(ffrp ffrpVar, fjbj fjbjVar, Throwable th) {
            if (ffrpVar.x()) {
                fjbjVar.c();
            }
            return ffcu.a;
        }

        @Override // defpackage.fjbl
        public Type responseType() {
            return this.responseType;
        }

        @Override // defpackage.fjbl
        public ffss<fjdu<T>> adapt(final fjbj<T> fjbjVar) {
            fjbjVar.getClass();
            final ffrq ffrqVar = new ffrq();
            ffrqVar.hZ(new ffji() { // from class: com.google.android.libraries.compose.tenor.rest.CoroutineCallAdapterFactory$ResponseCallAdapter$$ExternalSyntheticLambda0
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ffcu adapt$lambda$0;
                    adapt$lambda$0 = CoroutineCallAdapterFactory.ResponseCallAdapter.adapt$lambda$0(ffrp.this, fjbjVar, (Throwable) obj);
                    return adapt$lambda$0;
                }
            });
            fjbjVar.d(new fjbm<T>() { // from class: com.google.android.libraries.compose.tenor.rest.CoroutineCallAdapterFactory$ResponseCallAdapter$adapt$2
                @Override // defpackage.fjbm
                public void onFailure(fjbj<T> fjbjVar2, Throwable th) {
                    fjbjVar2.getClass();
                    th.getClass();
                    ffrqVar.a(th);
                }

                @Override // defpackage.fjbm
                public void onResponse(fjbj<T> fjbjVar2, fjdu<T> fjduVar) {
                    fjbjVar2.getClass();
                    fjduVar.getClass();
                    ffrqVar.b(fjduVar);
                }
            });
            return ffrqVar;
        }
    }

    private CoroutineCallAdapterFactory() {
    }

    public static final CoroutineCallAdapterFactory create() {
        return Companion.create();
    }

    @Override // defpackage.fjbk
    public fjbl<?, ?> get(Type type, Annotation[] annotationArr, fjdx fjdxVar) {
        type.getClass();
        annotationArr.getClass();
        fjdxVar.getClass();
        if (!ffkj.e(ffss.class, fjbk.getRawType(type))) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("Deferred return type must be parameterized as Deferred<Foo> or Deferred<out Foo>");
        }
        Type parameterUpperBound = fjbk.getParameterUpperBound(0, (ParameterizedType) type);
        parameterUpperBound.getClass();
        Class<?> rawType = fjbk.getRawType(parameterUpperBound);
        rawType.getClass();
        if (!ffkj.e(rawType, fjdu.class)) {
            return new BodyCallAdapter(parameterUpperBound);
        }
        if (!(parameterUpperBound instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<out Foo>");
        }
        Type parameterUpperBound2 = fjbk.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
        parameterUpperBound2.getClass();
        return new ResponseCallAdapter(parameterUpperBound2);
    }

    public /* synthetic */ CoroutineCallAdapterFactory(ffkd ffkdVar) {
        this();
    }
}
