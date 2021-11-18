package me.jellysquid.mods.sodium.render.chunk;

public enum ChunkUpdateType {
    LOD_CHANGE(false),
    INITIAL_BUILD(false),
    REBUILD(false),
    IMPORTANT_REBUILD(true);

    public static final int COUNT = ChunkUpdateType.values().length;
    private final boolean important;

    ChunkUpdateType(boolean important) {
        this.important = important;
    }

    public boolean isImportant() {
        return this.important;
    }
}