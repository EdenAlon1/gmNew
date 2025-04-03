package defpackage;

import com.google.android.rcs.client.messaging.data.GroupInformation;
import com.google.android.rcs.client.messaging.data.GroupMember;
import com.google.android.rcs.client.messaging.data.GroupRemoteCapabilities;
import com.google.android.rcs.client.messaging.data.SubjectExtension;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eimm extends eilg {
    static final emwd a = new einh();
    static final emwd b = new eimo();

    @Override // defpackage.eilg
    public final void b(GroupInformation groupInformation, clou clouVar) {
        clte clteVar = (clte) cltf.a.createBuilder();
        String d = groupInformation.d();
        clteVar.copyOnWrite();
        cltf cltfVar = (cltf) clteVar.instance;
        cltfVar.b |= 1;
        cltfVar.c = d;
        clouVar.copyOnWrite();
        clov clovVar = (clov) clouVar.instance;
        cltf cltfVar2 = (cltf) clteVar.build();
        clov clovVar2 = clov.a;
        cltfVar2.getClass();
        clovVar.e = cltfVar2;
        clovVar.b |= 4;
    }

    @Override // defpackage.eilg
    public final void c(GroupInformation groupInformation, clou clouVar) {
        Iterable iterable = (Iterable) Collection.EL.stream(groupInformation.a()).map(new Function() { // from class: eimk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (cloz) eimm.b.m().fP((GroupMember) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList());
        clouVar.copyOnWrite();
        clov clovVar = (clov) clouVar.instance;
        clov clovVar2 = clov.a;
        eygr eygrVar = clovVar.f;
        if (!eygrVar.c()) {
            clovVar.f = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, clovVar.f);
    }

    @Override // defpackage.eilg
    public final void d(GroupInformation groupInformation, final clou clouVar) {
        groupInformation.b().ifPresent(new Consumer() { // from class: eiml
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                GroupRemoteCapabilities groupRemoteCapabilities = (GroupRemoteCapabilities) obj;
                cloo clooVar = (cloo) clor.a.createBuilder();
                boolean c = groupRemoteCapabilities.c();
                clooVar.copyOnWrite();
                clor clorVar = (clor) clooVar.instance;
                clorVar.b |= 1;
                clorVar.c = c;
                if (groupRemoteCapabilities.a().isPresent() && ((Boolean) groupRemoteCapabilities.a().get()).booleanValue()) {
                    clooVar.copyOnWrite();
                    clor clorVar2 = (clor) clooVar.instance;
                    clorVar2.d = 1;
                    clorVar2.b |= 2;
                } else if (groupRemoteCapabilities.b().isPresent() && ((Boolean) groupRemoteCapabilities.b().get()).booleanValue()) {
                    clooVar.copyOnWrite();
                    clor clorVar3 = (clor) clooVar.instance;
                    clorVar3.d = 2;
                    clorVar3.b |= 2;
                } else {
                    clooVar.copyOnWrite();
                    clor clorVar4 = (clor) clooVar.instance;
                    clorVar4.d = 0;
                    clorVar4.b |= 2;
                }
                clou clouVar2 = clou.this;
                clouVar2.copyOnWrite();
                clov clovVar = (clov) clouVar2.instance;
                clor clorVar5 = (clor) clooVar.build();
                clov clovVar2 = clov.a;
                clorVar5.getClass();
                clovVar.g = clorVar5;
                clovVar.b |= 8;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.eilg
    public final void e(GroupInformation groupInformation, clou clouVar) {
        if (groupInformation.c().isPresent()) {
            String f = groupInformation.f();
            clouVar.copyOnWrite();
            clov clovVar = (clov) clouVar.instance;
            clov clovVar2 = clov.a;
            clovVar.b |= 2;
            clovVar.d = f;
            return;
        }
        if (groupInformation.f().isEmpty()) {
            return;
        }
        String f2 = groupInformation.f();
        clouVar.copyOnWrite();
        clov clovVar3 = (clov) clouVar.instance;
        clov clovVar4 = clov.a;
        clovVar3.b |= 2;
        clovVar3.d = f2;
    }

    @Override // defpackage.eilg
    public final void f(GroupInformation groupInformation, final clou clouVar) {
        groupInformation.c().ifPresent(new Consumer() { // from class: eimj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                SubjectExtension subjectExtension = (SubjectExtension) obj;
                clsk clskVar = (clsk) clsl.a.createBuilder();
                clqv clqvVar = (clqv) eimm.a.m().fP(subjectExtension.a().get());
                clskVar.copyOnWrite();
                clsl clslVar = (clsl) clskVar.instance;
                clqvVar.getClass();
                clslVar.c = clqvVar;
                clslVar.b |= 1;
                eyja d = eykm.d(((Instant) subjectExtension.b().get()).toEpochMilli());
                clskVar.copyOnWrite();
                clsl clslVar2 = (clsl) clskVar.instance;
                d.getClass();
                clslVar2.d = d;
                clslVar2.b |= 2;
                clsl clslVar3 = (clsl) clskVar.build();
                clou clouVar2 = clou.this;
                clouVar2.copyOnWrite();
                clov clovVar = (clov) clouVar2.instance;
                clov clovVar2 = clov.a;
                clslVar3.getClass();
                clovVar.h = clslVar3;
                clovVar.b |= 16;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
