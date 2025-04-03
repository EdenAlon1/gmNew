package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czne implements aemi {
    public static final entd a = entd.c("Bugle");
    private final Context b;
    private final ffbr c;
    private final ejlq d;
    private final ejlr e;
    private final ejlr f = new ejlr<SelectedConversation, eyjv<ajhw>>() { // from class: czne.1
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            ((ensz) ((ensz) czne.a.h()).h("com/google/android/apps/messaging/ui/conversation/pintotop/PinToTopMenuExtension$1", "onSuccess", 62, "PinToTopMenuExtension.java")).q("Conversation unpinned.");
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            ((ensz) ((ensz) ((ensz) czne.a.i()).g(th)).h("com/google/android/apps/messaging/ui/conversation/pintotop/PinToTopMenuExtension$1", "onFailure", 'C', "PinToTopMenuExtension.java")).q("Failed to pin conversation");
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };
    private MenuItem g;

    public czne(final Context context, ffbr ffbrVar, ejlq ejlqVar) {
        this.b = context;
        this.c = ffbrVar;
        this.d = ejlqVar;
        this.e = new ejlr<SelectedConversation, eyjv<ajhw>>() { // from class: czne.2
            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                ajhw ajhwVar = (ajhw) ((eyjv) obj2).a(ajhw.a, eyfc.a());
                int i = ajhwVar.b;
                int b = ajhv.b(i);
                if (b != 0 && b == 3) {
                    Toast.makeText(context, context.getResources().getQuantityString(R.plurals.pin_success_message_plural, ((Integer) ajhl.a.e()).intValue(), Integer.valueOf((int) ajhwVar.c), ajhl.a.e()), 1).show();
                    return;
                }
                int b2 = ajhv.b(i);
                if (b2 != 0 && b2 == 5) {
                    Toast.makeText(context, context.getResources().getQuantityString(R.plurals.pin_limit_messages_plural, ((Integer) ajhl.a.e()).intValue(), ajhl.a.e()), 1).show();
                }
            }

            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
                ((ensz) ((ensz) ((ensz) czne.a.i()).g(th)).h("com/google/android/apps/messaging/ui/conversation/pintotop/PinToTopMenuExtension$2", "onFailure", 'k', "PinToTopMenuExtension.java")).q("Failed to pin conversation");
            }

            @Override // defpackage.ejlr
            public final /* synthetic */ void b(Object obj) {
            }
        };
    }

    @Override // defpackage.aemi
    public final int a() {
        return R.id.action_pin_to_top;
    }

    @Override // defpackage.aemi
    public final void b(Menu menu) {
        MenuItem add = menu.add(0, R.id.action_pin_to_top, 40, this.b.getString(R.string.action_pin_to_top));
        this.g = add;
        add.setShowAsAction(2);
        this.g.setIcon(R.drawable.tinted_quantum_gm_ic_keep_pin_outline_24);
    }

    @Override // defpackage.aemi
    public final void c(Collection collection) {
        if (((Boolean) ajhl.b.e()).booleanValue() && collection.isEmpty()) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/ui/conversation/pintotop/PinToTopMenuExtension", "onClick", 139, "PinToTopMenuExtension.java")).q("No selected conversation to pin");
            return;
        }
        SelectedConversation selectedConversation = (SelectedConversation) collection.iterator().next();
        if (selectedConversation.q) {
            ejlq ejlqVar = this.d;
            final ajhr ajhrVar = (ajhr) this.c.b();
            final ConversationIdType conversationIdType = selectedConversation.a;
            int i = selectedConversation.o;
            ejlqVar.i(ejlp.a(elfo.g(new Callable() { // from class: ajhp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final ajhr ajhrVar2 = ajhr.this;
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    return (ajhw) ajhrVar2.c.c("unPinConversationToTop", new emyl() { // from class: ajhn
                        @Override // defpackage.emyl
                        public final Object get() {
                            ajhu createBuilder = ajhw.a.createBuilder();
                            String[] strArr = bryh.a;
                            brxz brxzVar = new brxz();
                            brxzVar.f("unpinConversationFromTop");
                            final ConversationIdType conversationIdType3 = conversationIdType2;
                            brxzVar.a(new Function() { // from class: ajhm
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bryg brygVar = (bryg) obj;
                                    entd entdVar = ajhr.a;
                                    brygVar.b(ConversationIdType.this);
                                    return brygVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int d = brxzVar.d();
                            brye bryeVar = new brye(bryh.a);
                            bryeVar.z("unpinConversationFromTop");
                            int i2 = bryeVar.b().i();
                            ajhr ajhrVar3 = ajhr.this;
                            ((cbgf) ajhrVar3.f.b()).e(conversationIdType3, true);
                            ajht ajhtVar = (ajht) ajhrVar3.e.b();
                            boolean z = d > 0;
                            ajhtVar.a(3, i2, z ? 2 : 3);
                            int i3 = true != z ? 4 : 3;
                            createBuilder.copyOnWrite();
                            ((ajhw) createBuilder.instance).b = ajhv.a(i3);
                            return createBuilder.build();
                        }
                    });
                }
            }, ajhrVar.b)), new ejlm(selectedConversation), this.f);
            return;
        }
        ejlq ejlqVar2 = this.d;
        final ajhr ajhrVar2 = (ajhr) this.c.b();
        final ConversationIdType conversationIdType2 = selectedConversation.a;
        int i2 = selectedConversation.o;
        ejlqVar2.i(ejlp.a(elfo.g(new Callable() { // from class: ajhq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final ajhr ajhrVar3 = ajhr.this;
                final ConversationIdType conversationIdType3 = conversationIdType2;
                return (ajhw) ajhrVar3.c.c("pinConversationToTop", new emyl() { // from class: ajho
                    @Override // defpackage.emyl
                    public final Object get() {
                        ajhu createBuilder = ajhw.a.createBuilder();
                        String[] strArr = bryh.a;
                        brye bryeVar = new brye(bryh.a);
                        bryeVar.z("pinConversationToTop");
                        int i3 = bryeVar.b().i();
                        int intValue = ((Integer) ajhl.a.e()).intValue();
                        ajhr ajhrVar4 = ajhr.this;
                        if (i3 >= intValue) {
                            ((ensz) ajhr.a.n().h("com/google/android/apps/messaging/pintotop/PinToTopManager", "pinConversationToTop", 62, "PinToTopManager.java")).t("Conversation pin threshold of %s reached", ajhl.a.e());
                            ((ajht) ajhrVar4.e.b()).a(2, i3, 4);
                            createBuilder.copyOnWrite();
                            ((ajhw) createBuilder.instance).b = ajhv.a(5);
                            return createBuilder.build();
                        }
                        ConversationIdType conversationIdType4 = conversationIdType3;
                        brxj brxjVar = new brxj();
                        brxjVar.b(conversationIdType4);
                        brxjVar.c(true);
                        final brxg a2 = brxjVar.a();
                        final dtve a3 = bryh.a();
                        long b = dtub.b(bryh.a(), "conversation_pin", a2, new Function() { // from class: brxd
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Long.valueOf(dtve.this.S("conversation_pin", (ContentValues) obj));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: brxe
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                brxg.this.l((Long) obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        Long.valueOf(b).getClass();
                        if (b <= 0) {
                            ((ensz) ajhr.a.n().h("com/google/android/apps/messaging/pintotop/PinToTopManager", "pinConversationToTop", 82, "PinToTopManager.java")).q("Conversation was not pinned.");
                            ((ajht) ajhrVar4.e.b()).a(2, i3, 3);
                            createBuilder.copyOnWrite();
                            ((ajhw) createBuilder.instance).b = ajhv.a(4);
                            return createBuilder.build();
                        }
                        int i4 = i3 + 1;
                        ((cbgf) ajhrVar4.f.b()).e(conversationIdType4, true);
                        ((ajht) ajhrVar4.e.b()).a(2, i4, 2);
                        ((adsd) ajhrVar4.d.b()).a(25);
                        createBuilder.copyOnWrite();
                        ((ajhw) createBuilder.instance).b = ajhv.a(3);
                        createBuilder.copyOnWrite();
                        ((ajhw) createBuilder.instance).c = i4;
                        return createBuilder.build();
                    }
                });
            }
        }, ajhrVar2.b)), new ejlm(selectedConversation), this.e);
    }

    @Override // defpackage.aemi
    public final void d(ea eaVar) {
        this.d.k(this.e);
        this.d.k(this.f);
    }

    @Override // defpackage.aemi
    public final void f(Collection collection) {
        if (collection.size() != 1) {
            this.g.setVisible(false);
            return;
        }
        SelectedConversation selectedConversation = (SelectedConversation) collection.iterator().next();
        if (selectedConversation.f.d()) {
            this.g.setVisible(false);
            return;
        }
        String string = selectedConversation.q ? this.b.getString(R.string.action_unpin_from_top) : this.b.getString(R.string.action_pin_to_top);
        this.g.setIcon(true != selectedConversation.q ? R.drawable.tinted_quantum_gm_ic_keep_pin_outline_24 : R.drawable.quantum_gm_ic_unpin_vd_theme_24);
        this.g.setTitle(string);
        this.g.setVisible(true);
    }

    @Override // defpackage.aemi
    public final /* synthetic */ void e() {
    }
}
