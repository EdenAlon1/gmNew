package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozr implements cowh {
    public final cozt a;
    public final cozn b;
    public final couo c;
    private final cozs d;
    private final errl e;
    private final avii f;

    public cozr(cozt coztVar, cozn coznVar, cozs cozsVar, avii aviiVar, couo couoVar, errl errlVar) {
        this.a = coztVar;
        this.b = coznVar;
        this.d = cozsVar;
        this.f = aviiVar;
        this.c = couoVar;
        this.e = errlVar;
    }

    @Override // defpackage.cowh
    public final elfl a(final MessageCoreData messageCoreData, final avkl avklVar, Optional optional) {
        elfl h;
        ekzz f = eleg.f("UnencryptedRcsChatMessageSender#sendChatMessage");
        try {
            awxv awxvVar = (awxv) awya.a.createBuilder();
            awxz awxzVar = awxz.USER;
            awxvVar.copyOnWrite();
            awya awyaVar = (awya) awxvVar.instance;
            awyaVar.c = awxzVar.d;
            awyaVar.b |= 1;
            awxx awxxVar = awxx.HIGH;
            awxvVar.copyOnWrite();
            awya awyaVar2 = (awya) awxvVar.instance;
            awyaVar2.d = awxxVar.e;
            awyaVar2.b |= 2;
            awxvVar.copyOnWrite();
            awya awyaVar3 = (awya) awxvVar.instance;
            awyaVar3.b |= 4;
            awyaVar3.e = true;
            final awya awyaVar4 = (awya) awxvVar.build();
            if (messageCoreData.cm() && !messageCoreData.cE()) {
                h = this.c.f(messageCoreData, avklVar, this.d, new cozo(), (awvd) optional.orElse(null), awyaVar4);
            } else if (messageCoreData.cr()) {
                couo couoVar = this.c;
                avii aviiVar = this.f;
                cozo cozoVar = new cozo();
                ekzz f2 = eleg.f("ChatApiSender::sendRbmSuggestionResponse");
                try {
                    if (messageCoreData.cr()) {
                        bdhg E = messageCoreData.E();
                        awzi awziVar = (awzi) awzj.a.createBuilder();
                        String f3 = E.f();
                        awziVar.copyOnWrite();
                        awzj awzjVar = (awzj) awziVar.instance;
                        awzjVar.b |= 1;
                        awzjVar.e = f3;
                        awzy awzyVar = (awzy) awzz.a.createBuilder();
                        eyja d = eykm.d(messageCoreData.r());
                        awzyVar.copyOnWrite();
                        awzz awzzVar = (awzz) awzyVar.instance;
                        d.getClass();
                        awzzVar.c = d;
                        awzzVar.b = 1 | awzzVar.b;
                        awziVar.copyOnWrite();
                        awzj awzjVar2 = (awzj) awziVar.instance;
                        awzz awzzVar2 = (awzz) awzyVar.build();
                        awzzVar2.getClass();
                        awzjVar2.d = awzzVar2;
                        awzjVar2.c = 7;
                        axad a = couoVar.a(messageCoreData);
                        awziVar.copyOnWrite();
                        awzj awzjVar3 = (awzj) awziVar.instance;
                        a.getClass();
                        awzjVar3.g = a;
                        awzjVar3.b |= 4;
                        h = couoVar.n(messageCoreData, elfo.g(new Callable() { // from class: avih
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                awuk awukVar = (awuk) awul.a.createBuilder();
                                String ay = MessageCoreData.this.ay();
                                ay.getClass();
                                eyee A = eyee.A(ay);
                                awukVar.copyOnWrite();
                                awul awulVar = (awul) awukVar.instance;
                                awulVar.b |= 2;
                                awulVar.d = A;
                                awun awunVar = (awun) awup.a.createBuilder();
                                awunVar.copyOnWrite();
                                awup awupVar = (awup) awunVar.instance;
                                awupVar.b |= 1;
                                awupVar.c = "application";
                                awunVar.copyOnWrite();
                                awup awupVar2 = (awup) awunVar.instance;
                                awupVar2.b |= 2;
                                awupVar2.d = "vnd.gsma.botsuggestion.response.v1.0+json";
                                awukVar.copyOnWrite();
                                awul awulVar2 = (awul) awukVar.instance;
                                awup awupVar3 = (awup) awunVar.build();
                                awupVar3.getClass();
                                awulVar2.c = awupVar3;
                                awulVar2.b |= 1;
                                return (awul) awukVar.build();
                            }
                        }, aviiVar.a), avklVar, cozoVar, awyaVar4, E, (awzj) awziVar.build(), 6);
                    } else {
                        h = elfo.e(couo.b);
                    }
                    f2.b(h);
                    f2.close();
                } finally {
                }
            } else {
                h = this.c.o(messageCoreData, avklVar, this.a, new cozo(), awyaVar4).i(new eroh() { // from class: cozp
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        ckbx ckbxVar = (ckbx) obj;
                        if (ckbxVar.c() != 0) {
                            return elfo.e(ckbxVar);
                        }
                        awya awyaVar5 = awyaVar4;
                        avkl avklVar2 = avklVar;
                        MessageCoreData messageCoreData2 = messageCoreData;
                        cozr cozrVar = cozr.this;
                        return cozrVar.c.g(messageCoreData2, avklVar2, cozrVar.b, new cozo(), awyaVar5);
                    }
                }, this.e).h(new emwl() { // from class: cozq
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ckbx ckbxVar = (ckbx) obj;
                        if (ckbxVar.c() != 0) {
                            return ckbxVar;
                        }
                        MessageCoreData messageCoreData2 = messageCoreData;
                        cozr cozrVar = cozr.this;
                        if (couo.p(messageCoreData2) || couo.j(messageCoreData2, cozrVar.b)) {
                            return ckbxVar;
                        }
                        ckbw j = ckbx.j(3, 10003);
                        j.b(1);
                        eqxh eqxhVar = (eqxh) eqxi.a.createBuilder();
                        eqxj eqxjVar = (eqxj) eqxk.a.createBuilder();
                        eqxjVar.copyOnWrite();
                        eqxk eqxkVar = (eqxk) eqxjVar.instance;
                        eqxkVar.e = 1;
                        eqxkVar.b |= 4;
                        eqww eqwwVar = eqww.CHAT_API_EMPTY_CHAT_MESSAGE;
                        eqxjVar.copyOnWrite();
                        eqxk eqxkVar2 = (eqxk) eqxjVar.instance;
                        eqxkVar2.f = eqwwVar.C;
                        eqxkVar2.b |= 8;
                        eqxhVar.copyOnWrite();
                        eqxi eqxiVar = (eqxi) eqxhVar.instance;
                        eqxk eqxkVar3 = (eqxk) eqxjVar.build();
                        eqxkVar3.getClass();
                        eqxiVar.c = eqxkVar3;
                        eqxiVar.b = 1 | eqxiVar.b;
                        ((ckaw) j).d = (eqxi) eqxhVar.build();
                        return j.a();
                    }
                }, this.e);
            }
            f.b(h);
            f.close();
            return h;
        } finally {
        }
    }
}
