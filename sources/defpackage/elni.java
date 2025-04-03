package defpackage;

import android.app.Activity;
import android.app.DirectAction;
import android.app.VoiceInteractor;
import android.content.LocusId;
import android.os.Bundle;
import android.os.Handler;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elni extends elne {
    public elni(Activity activity, elnp elnpVar) {
        super(new elnh(activity), elnpVar);
    }

    public final void b(Consumer consumer) {
        DirectAction.Builder extras;
        DirectAction.Builder locusId;
        DirectAction build;
        DirectAction.Builder extras2;
        DirectAction.Builder locusId2;
        DirectAction build2;
        Bundle extras3;
        Bundle extras4;
        VoiceInteractor voiceInteractor;
        boolean isDestroyed;
        final ArrayList arrayList = new ArrayList();
        Consumer consumer2 = new Consumer() { // from class: elnf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                arrayList.addAll((List) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer3) {
                return Consumer$CC.$default$andThen(this, consumer3);
            }
        };
        final elnh elnhVar = this.d;
        Runnable runnable = new Runnable() { // from class: elnc
            @Override // java.lang.Runnable
            public final void run() {
                VoiceInteractor voiceInteractor2;
                boolean isDestroyed2;
                elnh elnhVar2 = elnh.this;
                if (elnhVar2.a.isDestroyed() || (voiceInteractor2 = elnhVar2.a.getVoiceInteractor()) == null) {
                    return;
                }
                isDestroyed2 = voiceInteractor2.isDestroyed();
                if (isDestroyed2) {
                    return;
                }
                voiceInteractor2.notifyDirectActionsChanged();
            }
        };
        elzg elzgVar = (elzg) elzj.a.createBuilder();
        elnp elnpVar = this.e;
        Stream stream = Collection.EL.stream(((dlou) elnpVar).a);
        final elna elnaVar = (elna) elnpVar;
        Iterable iterable = (Iterable) stream.filter(new Predicate() { // from class: elmv
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return elna.this.a(((elno) obj).a());
            }
        }).map(new Function() { // from class: elmw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                elno elnoVar = (elno) obj;
                int i = elna.d;
                elze elzeVar = (elze) elnoVar.a().d().toBuilder();
                String b = elnoVar.b();
                elzeVar.copyOnWrite();
                elzf elzfVar = (elzf) elzeVar.instance;
                b.getClass();
                elzfVar.c = b;
                return (elzf) elzeVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList());
        elzgVar.copyOnWrite();
        elzj elzjVar = (elzj) elzgVar.instance;
        eygr eygrVar = elzjVar.d;
        if (!eygrVar.c()) {
            elzjVar.d = eyfy.mutableCopy(eygrVar);
        }
        AtomicBoolean atomicBoolean = this.c;
        eydl.addAll(iterable, elzjVar.d);
        emah emahVar = (emah) emai.a.createBuilder();
        emahVar.copyOnWrite();
        emai emaiVar = (emai) emahVar.instance;
        emaiVar.b |= 1;
        emaiVar.c = 0L;
        emahVar.copyOnWrite();
        emai emaiVar2 = (emai) emahVar.instance;
        emaiVar2.b |= 2;
        emaiVar2.d = 0L;
        emahVar.copyOnWrite();
        emai emaiVar3 = (emai) emahVar.instance;
        emaiVar3.b |= 4;
        emaiVar3.e = 1L;
        emai emaiVar4 = (emai) emahVar.build();
        elzgVar.copyOnWrite();
        elzj elzjVar2 = (elzj) elzgVar.instance;
        emaiVar4.getClass();
        elzjVar2.c = emaiVar4;
        elzjVar2.b |= 1;
        List singletonList = Collections.singletonList(new elnj((elzj) elzgVar.build()));
        int i = elnm.b;
        elnk elnkVar = new elnk(DesugarCollections.unmodifiableList(new ArrayList(singletonList)));
        atomicBoolean.set(false);
        if (!((Optional) this.b.getAndSet(Optional.of(runnable))).isPresent()) {
            this.e.e.add(this);
            elnh elnhVar2 = this.d;
            Runnable runnable2 = new Runnable() { // from class: elnd
                @Override // java.lang.Runnable
                public final void run() {
                    elne elneVar = elne.this;
                    if (((Optional) elneVar.b.getAndSet(elne.a)).isPresent()) {
                        elneVar.e.e.remove(elneVar);
                    }
                }
            };
            if (!elnhVar2.a.isDestroyed() && (voiceInteractor = elnhVar2.a.getVoiceInteractor()) != null) {
                isDestroyed = voiceInteractor.isDestroyed();
                if (!isDestroyed) {
                    final Handler handler = elnhVar2.b;
                    voiceInteractor.registerOnDestroyedCallback(new Executor() { // from class: elng
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable3) {
                            handler.post(runnable3);
                        }
                    }, runnable2);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (elnj elnjVar : elnkVar.a) {
            DirectAction.Builder builder = new DirectAction.Builder("app_action");
            Bundle bundle = new Bundle();
            bundle.putBundle("metadata", elnr.a("app_action_metadata", elnjVar.a));
            extras2 = builder.setExtras(bundle);
            locusId2 = extras2.setLocusId(new LocusId("unused"));
            build2 = locusId2.build();
            AtomicReference atomicReference = elnv.a;
            extras3 = build2.getExtras();
            extras3.getClass();
            extras4 = build2.getExtras();
            extras4.putString("com.google.assistant.appactions.HANDOVER_TOKEN", (String) ((Optional) elnv.a.get()).orElse(null));
            arrayList2.add(build2);
        }
        consumer2.o(DesugarCollections.unmodifiableList(arrayList2));
        elnh elnhVar3 = this.d;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("component_name", elnhVar3.a.getComponentName());
        extras = new DirectAction.Builder("foreground_app").setExtras(bundle2);
        locusId = extras.setLocusId(new LocusId("unused"));
        build = locusId.build();
        arrayList.add(build);
        consumer.o(DesugarCollections.unmodifiableList(arrayList));
    }
}
