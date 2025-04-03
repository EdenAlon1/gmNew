package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class algp {
    private Optional c = Optional.empty();
    public int b = 1;
    public Optional a = Optional.empty();

    public final epai a() {
        final epag epagVar = (epag) epai.a.createBuilder();
        int i = this.b;
        epagVar.copyOnWrite();
        epai epaiVar = (epai) epagVar.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        epaiVar.d = i2;
        epaiVar.b |= 2;
        this.a.ifPresent(new Consumer() { // from class: algn
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                String a = cski.a((String) obj);
                epag epagVar2 = epag.this;
                epagVar2.copyOnWrite();
                epai epaiVar2 = (epai) epagVar2.instance;
                epai epaiVar3 = epai.a;
                a.getClass();
                epaiVar2.b |= 4;
                epaiVar2.e = a;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.c.ifPresent(new Consumer() { // from class: algo
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                String a = cski.a((String) obj);
                epag epagVar2 = epag.this;
                epagVar2.copyOnWrite();
                epai epaiVar2 = (epai) epagVar2.instance;
                epai epaiVar3 = epai.a;
                a.getClass();
                epaiVar2.b |= 1;
                epaiVar2.c = a;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return (epai) epagVar.build();
    }

    public final void b(String str) {
        this.c = Optional.of(str);
    }
}
