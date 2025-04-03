package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffiu {
    public static final Class a(ffmo ffmoVar) {
        ffmoVar.getClass();
        return ((ffka) ffmoVar).a();
    }

    public static final Class b(ffmo ffmoVar) {
        String name;
        ffmoVar.getClass();
        Class a = ((ffka) ffmoVar).a();
        if (!a.isPrimitive() || (name = a.getName()) == null) {
            return a;
        }
        switch (name.hashCode()) {
            case -1325958191:
                return name.equals("double") ? Double.class : a;
            case 104431:
                return name.equals("int") ? Integer.class : a;
            case 3039496:
                return name.equals("byte") ? Byte.class : a;
            case 3052374:
                return name.equals("char") ? Character.class : a;
            case 3327612:
                return name.equals(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG) ? Long.class : a;
            case 3625364:
                return name.equals("void") ? Void.class : a;
            case 64711720:
                return name.equals("boolean") ? Boolean.class : a;
            case 97526364:
                return name.equals("float") ? Float.class : a;
            case 109413500:
                return name.equals("short") ? Short.class : a;
            default:
                return a;
        }
    }

    public static final ffmo c(Class cls) {
        cls.getClass();
        int i = fflc.a;
        return new ffkb(cls);
    }
}
